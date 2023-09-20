package com.notesapp.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.notesapp.feature_note.presentation.add_edit_note.AddEditNoteScreen
import com.notesapp.feature_note.presentation.notes.NotesScreen
import com.notesapp.feature_note.presentation.util.Screens
import com.notesapp.ui.theme.DarkGray
import com.notesapp.ui.theme.NotesAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesAppTheme {
                Surface(
                    color = DarkGray
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,
                        startDestination = Screens.NotesScreen.route
                    ) {
                        composable(route = Screens.NotesScreen.route) {
                            NotesScreen(navController = navController)
                        }
                        composable(
                            route = Screens.AddEditNoteScreen.route +
                                    "?noteId={noteId}&noteColor={noteColor}",
                            arguments = listOf(
                                navArgument(
                                    name = "noteId",
                                ) {
                                    type = NavType.IntType
                                    defaultValue = -1
                                },
                                navArgument(
                                    name = "noteColor"
                                ) {
                                    type = NavType.IntType
                                    defaultValue = -1
                                }
                            )
                        ){
                            AddEditNoteScreen(
                                navController = navController,
                                noteColor = it.arguments?.getInt("noteColor") ?: -1
                            )
                        }
                    }
                }
            }
        }
    }
}
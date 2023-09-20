package com.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.notesapp.ui.theme.BabyBlue
import com.notesapp.ui.theme.LightGreen
import com.notesapp.ui.theme.RedOrange
import com.notesapp.ui.theme.RedPink
import com.notesapp.ui.theme.Violet

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val color: Int,
    val timestamp: Long
) {
    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}

class InvalidNoteException(message: String): Exception(message)
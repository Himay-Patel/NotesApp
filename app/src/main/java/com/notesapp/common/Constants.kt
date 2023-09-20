package com.notesapp.common

object Constants {

    const val BASE_URL = "http://192.168.0.5:3000"
    const val LOGIN_URL = "$BASE_URL/login"
    const val VERIFY_EMAIL_URL = "$BASE_URL/verifyemail"
    const val STORE_OTP_URL = "$BASE_URL/storeotp"
    const val SEND_OTP_URL = "$BASE_URL/sendotp"
    const val DELETE_OTP_URL = "$BASE_URL/deleteotp"
    const val RESET_PASSWORD_URL = "$BASE_URL/resetpassword"
    const val MY_UPLOADS_URL = "$BASE_URL/getmyuploads"
    const val GET_PURCHASABLE_URL = "$BASE_URL/getpurchasablelist"
    const val SAVE_ANIMAL_DETAILS_URL = "$BASE_URL/saveanimaldetails"
    const val GENERATE_ORDER_URL = "$BASE_URL/generateorder"
    const val SAVE_USER_PROFILE_URL = "$BASE_URL/saveprofileimage"
    const val ANIMAL_IMAGE_URL = "$BASE_URL/public/animal_image/"
    const val USER_PROFILE_URL = "$BASE_URL/public/profile_image/"
}
package hn.edu.ujcv.pdm_2021_ii_p3_proyecto3.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)
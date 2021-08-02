package hn.edu.ujcv.pdm_2021_ii_p3_proyecto3_alpha.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)
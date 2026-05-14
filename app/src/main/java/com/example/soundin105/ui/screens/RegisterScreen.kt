package com.example.soundin105.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.soundin105.ui.RegisterViewModel
import com.example.soundin105.ui.theme.SoundIn105Theme

@Composable
fun RegisterContent(
    paddingValues: PaddingValues,
    name: String,
    onNameChanged:(String) -> Unit,
    nameError: Boolean,
    email: String,
    onEmailChanged: (String) -> Unit,
    emailError: Boolean,
    password: String,
    onPasswordChanged: (String) -> Unit,
    passwordError: Boolean,
    passwordConfirm: String,
    onPasswordConfirmChanged: (String) -> Unit,
    passwordConfirmError: Boolean,
    birthDate: String,
    onBirthDateChanged: (String) -> Unit,
    birthDateError: Boolean,
    genre: String,
    onGenreChanged: (String) -> Unit,
    genreError: Boolean,
    acceptedTerms: Boolean,
    onAcceptedTermsChanged: (Boolean) -> Unit,
    acceptedTermsError: Boolean,
){

}

@Composable
fun RegisterScreen(
    viewModel: RegisterViewModel = viewModel(),
    onNavigateToLogin: () -> Unit
){
    val name by viewModel.name.collectAsStateWithLifecycle()
    val nameError by viewModel.nameError.collectAsStateWithLifecycle()
    val email by viewModel.email.collectAsStateWithLifecycle()
    val emailError by viewModel.emailError.collectAsStateWithLifecycle()
    val password by viewModel.password.collectAsStateWithLifecycle()
    val passwordError by viewModel.passwordError.collectAsStateWithLifecycle()
    val passwordConfirm by viewModel.passwordConfirm.collectAsStateWithLifecycle()
    val passwordConfirmError by viewModel.passwordConfirmError.collectAsStateWithLifecycle()
    val birthDate by viewModel.birthDate.collectAsStateWithLifecycle()
    val birthDateError by viewModel.birthDateError.collectAsStateWithLifecycle()
    val genre by viewModel.genre.collectAsStateWithLifecycle()
    val genreError by viewModel.genreError.collectAsStateWithLifecycle()
    val acceptedTerms by viewModel.acceptedTerms.collectAsStateWithLifecycle()
    val acceptedTermsError by viewModel.acceptedTermsError.collectAsStateWithLifecycle()

    Scaffold{
        paddingValues ->
        RegisterContent(
            paddingValues = paddingValues,
            name = name,
            onNameChanged = viewModel :: onNameChanged,
            nameError = nameError,
            email = email,
            onEmailChanged = viewModel:: onEmailChanged,
            emailError = emailError,
            password = password,
            onPasswordChanged = viewModel:: onPasswordChanged,
            passwordError = passwordError,
            passwordConfirm = passwordConfirm,
            onPasswordConfirmChanged = viewModel:: onPasswordConfirmChanged,
            passwordConfirmError = passwordConfirmError,
            birthDate = birthDate,
            onBirthDateChanged = viewModel:: onBirthDateChanged,
            birthDateError = birthDateError,
            genre = genre,
            onGenreChanged = viewModel:: onGenreChanged,
            genreError = genreError,
            acceptedTerms = acceptedTerms,
            onAcceptedTermsChanged = viewModel:: onAcceptedTermsChanged,
            acceptedTermsError = acceptedTermsError,

        )
    }


}


@Preview(showBackground = true)
@Composable
fun RegisterContentPreview(){
    SoundIn105Theme() {}
}

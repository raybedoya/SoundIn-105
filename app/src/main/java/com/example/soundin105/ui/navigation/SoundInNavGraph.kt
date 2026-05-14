package com.example.soundin105.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.soundin105.ui.UserSessionViewModel
import com.example.soundin105.ui.screens.LoginScreen
import com.example.soundin105.ui.screens.MainScreen
import com.example.soundin105.ui.screens.RegisterScreen

@Composable
fun SoundInNavGraph(
    navController: NavHostController,
    sessionViewModel: UserSessionViewModel
){
    NavHost(
        navController = navController,
        startDestination = SoundInRoutes.LOGIN


    ){
        composable(SoundInRoutes.LOGIN){
            LoginScreen(
                sessionViewModel = sessionViewModel,
                onNavigateToRegister = {
                    navController.navigate(SoundInRoutes.REGISTER)
                },
                onLoginSuccess = {
                    navController.navigate(SoundInRoutes.MAIN){
                        popUpTo(SoundInRoutes.LOGIN) {inclusive = true}
                    }
                }
            )
        }// end of login composable
        composable(SoundInRoutes.REGISTER){
            RegisterScreen(
                onNavigateToLogin = {
                    navController.navigate(SoundInRoutes.LOGIN){
                        popUpTo(SoundInRoutes.LOGIN) {inclusive = true}
                    }
                }
            )
        }
        composable(SoundInRoutes.MAIN){
            MainScreen(
                sessionViewModel = sessionViewModel,
                onLogout = {
                    navController.navigate(SoundInRoutes.LOGIN){
                        popUpTo (SoundInRoutes.MAIN){inclusive = true}}

                }
            )
        }
    }
}
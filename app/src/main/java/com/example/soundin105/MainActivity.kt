package com.example.soundin105

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.soundin105.ui.UserSessionViewModel
import com.example.soundin105.ui.navigation.SoundInNavGraph
import com.example.soundin105.ui.screens.LoginScreen
import com.example.soundin105.ui.theme.SoundIn105Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val sessionViewModel: UserSessionViewModel = viewModel()
            SoundIn105Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    SoundInNavGraph(navController = navController,
                        sessionViewModel = sessionViewModel
                    )

                }

            }
        }
    }

}







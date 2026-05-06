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
import androidx.compose.ui.tooling.preview.Preview
import com.example.soundin105.ui.screens.LoginScreen
import com.example.soundin105.ui.theme.SoundIn105Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoundIn105Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    LoginScreen(
                        onNavigateToRegister = {}
                    )
                }

            }
        }
    }
}
@Preview
@Composable
fun SoundIn105Preview(){
    SoundIn105Theme() {
        LoginScreen(
            onNavigateToRegister = {
                
            }
        )

    }
}






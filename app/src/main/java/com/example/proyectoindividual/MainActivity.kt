package com.example.proyectoindividual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.proyectoindividual.ui.screen.LoginScreen
import com.example.proyectoindividual.ui.screen.RecuperarScreen
import com.example.proyectoindividual.ui.screen.RegistroScreen
import com.example.proyectoindividual.ui.theme.ProyectoIndividualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoIndividualTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Deja descomentada SOLO la pantalla que quieras ver
                   LoginScreen()
                   // RecuperarScreen()
                }
            }
        }
    }
}
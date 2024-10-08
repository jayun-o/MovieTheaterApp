package com.typ.movietheaterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.typ.movietheaterapp.ui.screen.DiscoverScreenState
import com.typ.movietheaterapp.ui.screen.DiscoveryScreen
import com.typ.movietheaterapp.ui.theme.MovieTheaterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieTheaterAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiscoveryScreen(
                        modifier = Modifier.padding(innerPadding),
                        screenState = DiscoverScreenState()
                    )
                }
            }
        }
    }
}

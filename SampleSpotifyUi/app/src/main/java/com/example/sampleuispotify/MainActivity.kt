package com.example.sampleuispotify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import com.example.sampleuispotify.features.CreateAccountEmailScreen
import com.example.sampleuispotify.ui.theme.SampleUiSpotifyTheme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleUiSpotifyTheme {
                CreateAccountEmailScreen(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding()
                )
            }
        }
    }

}

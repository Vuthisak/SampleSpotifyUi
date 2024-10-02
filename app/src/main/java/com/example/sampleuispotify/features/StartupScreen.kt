package com.example.sampleuispotify.features

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sampleuispotify.R
import com.example.sampleuispotify.ui.theme.SampleUiSpotifyTheme

@Composable
fun StartupScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier =
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = Color(0xFF121212)),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(R.drawable.ic_white_spotify), contentDescription = null)
        }
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .height(0.dp)
            ) { }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .height(0.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Millions of Songs. \n Free on Spotify",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color(0xFF1ED760)
                    )
                ) {
                    Text(textAlign = TextAlign.Center, text = "Sign up free")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleUiSpotifyTheme {
        StartupScreen()
    }
}
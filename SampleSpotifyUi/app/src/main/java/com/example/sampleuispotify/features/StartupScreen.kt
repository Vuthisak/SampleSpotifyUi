package com.example.sampleuispotify.features

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
                        .padding(top = 32.dp, start = 55.dp, end = 55.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Millions of Songs. Free on Spotify",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 22.dp, start = 45.dp, end = 45.dp),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color(0xFF1ED760)
                    )
                ) {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Sign up free",
                        fontWeight = FontWeight.Bold
                    )
                }

                LoginWithButton(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    icon = R.drawable.ic_google_login,
                    title = "Continue with Google"
                )

                LoginWithButton(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    icon = R.drawable.ic_facebook_login,
                    title = "Continue with Facebook"
                )

                LoginWithButton(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    icon = R.drawable.ic_apple_login,
                    title = "Continue with Apple"
                )

                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 6.dp),
                    text = "Log In",
                    color = Color(0XFFF5F5F5),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun LoginWithButton(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    title: String
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 45.dp, end = 45.dp),
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Transparent,
        ),
        border = ButtonDefaults.outlinedButtonBorder
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Image(
                modifier = Modifier.wrapContentSize(),
                painter = painterResource(icon),
                contentDescription = null,
                alignment = Alignment.CenterStart
            )
            Text(
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.Center),
                textAlign = TextAlign.Center,
                text = title,
                fontWeight = FontWeight.Bold
            )
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
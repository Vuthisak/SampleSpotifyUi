package com.example.sampleuispotify.features

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sampleuispotify.R
import com.example.sampleuispotify.ui.theme.SampleUiSpotifyTheme

@ExperimentalMaterial3Api
@Composable
fun CreateAccountEmailScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(modifier = modifier) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF121212))
                .padding(paddingValues)
        ) {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(paddingValues), title = {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(R.drawable.ic_chevron_left),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "Create Account",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                        )
                    }
                }, colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
            )

            val containerColor = Color(0xFF777777)
            var text by remember { mutableStateOf("") }

            OutlinedTextField(
                value = text,
                onValueChange = { newText -> text = newText },
                singleLine = true,
                visualTransformation = VisualTransformation.None,
                shape = RoundedCornerShape(5.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    focusedBorderColor = containerColor,
                    unfocusedBorderColor = containerColor,
                    cursorColor = Color.White,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 4.dp)
                    .height(56.dp)
            )

            Text(
                modifier = Modifier.padding(start = 16.dp),
                text = "You’ll need to confirm this email later.",
                fontWeight = FontWeight.SemiBold,
                fontSize = 8.sp,
                style = TextStyle(color = Color.White)
            )
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun CreateAccountEmailPreview() {
    SampleUiSpotifyTheme {
        CreateAccountEmailScreen(modifier = Modifier.fillMaxSize())
    }
}
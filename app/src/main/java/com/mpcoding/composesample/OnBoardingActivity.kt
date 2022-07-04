package com.mpcoding.composesample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class OnBoardingActivity {

    @Composable
    fun OnBoardingScreen() {
        val shouldShowOnBoarding by remember { mutableStateOf(true) }
        Surface {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Welcome")
                Button(modifier = Modifier.padding(vertical = 20.dp), onClick = { /*TODO*/ }) {
                    Text(text = "Continue")
                }
            }

        }
    }
}

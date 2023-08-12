package com.example.navigationexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HomeScreenUI(navController: NavController){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.tertiary)
            .paint(painter = painterResource(id = R.drawable.waterfall_image))
    ){

        Text(
            text = "Home",
            style = MaterialTheme.typography.displayLarge,
            color = MaterialTheme.colorScheme.inversePrimary)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
  //  HomeScreen()
}



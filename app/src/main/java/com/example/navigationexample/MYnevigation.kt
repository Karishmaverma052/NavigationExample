package com.example.navigationexample

import android.icu.lang.UCharacter.IndicPositionalCategory.NA
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Destination( val route: String){
    object Welcome: Destination("Welcome")
    object  Home: Destination("Home")

}
@Composable
fun MynevigationHost(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Destination.Welcome.route,
        ){
        composable(Destination.Welcome.route){ WelcomeScreenUI(navController = navController)}
        composable(Destination.Home.route){ HomeScreenUI(navController=navController)}

    }
}
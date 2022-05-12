package com.example.moviesapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.moviesapp.MainViewModel
import androidx.compose.material.Text

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text("Details screen: item id: ${itemId}")
}
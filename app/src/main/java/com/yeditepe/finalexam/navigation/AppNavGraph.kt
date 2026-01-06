package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        composable("tasks"){

        }

        // TODO 2: Add composable for "taskDetail/{title}"
        compasable("taskDetail/{title}") {backStackEntry ->}
        val title = backStackEntry.arguments?.getString("taskDetail title")
        TaskDetailScreen(title = title)
    }
}

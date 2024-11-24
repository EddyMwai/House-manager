package com.example.housemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.housemanager.auth.Register
import com.example.housemanager.auth.HomeScreen
import com.example.housemanager.auth.LandingPage
import com.example.housemanager.auth.Login
import com.example.housemanager.auth.AdminPage
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.housemanager.ui.theme.HouseManagerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HouseManagerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "landing"
                ) {
                    composable("landing") {
                        LandingPage(navController)
                    }
                    composable("login") {
                        Login(navController)
                    }
                    composable("register") {
                        Register(navController)
                    }
                    composable("home") {
                        HomeScreen(navController)
                    }
                    composable("admin") {
                        AdminPage(navController)
                    }
//                    composable(
//                        "eventDetail/{name}/{location}/{price}/{imageUrl}",
//                        arguments = listOf(
//                            navArgument("name") { type = NavType.StringType },
//                            navArgument("location") { type = NavType.StringType },
//                            navArgument("price") { type = NavType.FloatType },
//                            navArgument("imageUrl") { type = NavType.StringType }
//                        )
//                    ) { backStackEntry ->
//                        val name = backStackEntry.arguments?.getString("name")
//                        val location = backStackEntry.arguments?.getString("location")
//                        val price = backStackEntry.arguments?.getFloat("price")
//                        val imageUrl = backStackEntry.arguments?.getString("imageUrl")
//
//
//                    }
                }
            }
        }
    }
}

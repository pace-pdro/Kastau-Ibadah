package com.pacepdro.kastauibadah.android.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pacepdro.kastauibadah.android.screen.AlkitabWebView
import com.pacepdro.kastauibadah.android.screen.JadwalScreen
import com.pacepdro.kastauibadah.android.screen.home

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route)
        {
            home()
        }
        composable(route = BottomBarScreen.Calendar.route)
        {
            JadwalScreen()
        }
        composable(route = BottomBarScreen.Alkitab.route)
        {
            AlkitabWebView()
        }
        composable(route = BottomBarScreen.Profile.route)
        {
            JadwalScreen()
        }
    }
}
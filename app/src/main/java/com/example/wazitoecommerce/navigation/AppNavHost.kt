package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.Business.BusinessScreen
import com.example.wazitoecommerce.ui.theme.screens.adminlogin.AdminLoginScreen
import com.example.wazitoecommerce.ui.theme.screens.adminregister.AdminSignupScreen
import com.example.wazitoecommerce.ui.theme.screens.architecture.AddArchitectureScreen
import com.example.wazitoecommerce.ui.theme.screens.architecture.ViewArchitectureScreen
import com.example.wazitoecommerce.ui.theme.screens.catering.CateringScreen
import com.example.wazitoecommerce.ui.theme.screens.computing.ComputingScreen
import com.example.wazitoecommerce.ui.theme.screens.opening.OpeningScreen
import com.example.wazitoecommerce.ui.theme.screens.homepage.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.law.LawScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.opening.OpeningScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.SplashScreen
import com.example.wazitoecommerce.ui.theme.screens.engineering.EngineeringScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SPLASH_URL){
            SplashScreen(navController = navController)
        }
        composable(ADMINLOG_URL){
            AdminLoginScreen(navController = navController)
        } 
        composable(ADMINSIGN_URL){
           AdminSignupScreen(navController = navController)
        } 
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(OPENING_URL){
           OpeningScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        } 
        composable(COMP_URL){
            ComputingScreen(navController = navController)
        }
        composable(ENG_URL){
           EngineeringScreen(navController = navController)
        }
        composable(LAW_URL){
           LawScreen(navController = navController)
        }
        composable(BUSINESS_URL){
           BusinessScreen(navController = navController)
        }
        composable(CATERING_URL){
           CateringScreen(navController = navController)
        }

        composable(ADD_ARCHITECTURE_URL){
            AddArchitectureScreen(navController = navController)
        }
        composable(VIEW_ARCHITECTURE_URL){
            ViewArchitectureScreen(navController = navController)
        }
    }
}
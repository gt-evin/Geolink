package com.example.wazitoecommerce.ui.theme.screens.opening

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

import com.example.wazitoecommerce.navigation.LOGIN_URL

import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.ui.theme.Brown
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun OpeningScreen(navController: NavHostController){

    val mContext = LocalContext.current

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.geolink),
            contentDescription = "car",
            modifier = Modifier
                .size(150.dp)


        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "GEOLINK",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome to GeoLink. Take the next step and be part of our journey.Help us help you!",
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {navController.navigate(LOGIN_URL)},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Brown),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 130.dp, end = 130.dp)
        ) {
            Text(text = "Log In")

        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {navController.navigate(SIGNUP_URL)},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Brown),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 130.dp, end = 130.dp)
        ) {
            Text(text = "Sign in")

        }



    }

}

@Composable
@Preview(showBackground = true)
fun OpeningScreenPreview(){
    WazitoECommerceTheme{
        OpeningScreen(navController = rememberNavController())
    }
}
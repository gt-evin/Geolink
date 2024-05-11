package com.example.wazitoecommerce.ui.theme.screens.homepage


import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_ARCHITECTURE_URL
import com.example.wazitoecommerce.navigation.BUSINESS_URL
import com.example.wazitoecommerce.navigation.CATERING_URL
import com.example.wazitoecommerce.navigation.COMP_URL
import com.example.wazitoecommerce.navigation.ENG_URL
import com.example.wazitoecommerce.navigation.LAW_URL

import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){

    val mContext = LocalContext.current


    Column {

        TopAppBar(title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(),
            navigationIcon = {
                IconButton(onClick = {  }) {}

            },
            actions = {




                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )

                }


            })
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { Toast.makeText(mContext,"Clicked on main image", Toast.LENGTH_LONG).show() }
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.empire),
                contentDescription ="ibiza",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "WELCOME TO GEOLINK",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Start

            )

        }

        Spacer(modifier = Modifier.height(10.dp))


        Column (modifier = Modifier.padding(start = 20.dp)){
            //Row 1
            Row {
                Column {
                    Card (modifier = Modifier.clickable { navController.navigate(COMP_URL) }.size(width = 180.dp, height = 100.dp )){

                        Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.computing),
                                contentDescription = "cl1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop



                            )
                            Text(text = "Computing",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                color = Color.Black
                            )
                        }
                    }

                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Card (modifier = Modifier.size(width = 180.dp, height = 100.dp )){

                        Box (modifier = Modifier.clickable { navController.navigate(LAW_URL) }.fillMaxSize(), contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.law),
                                contentDescription = "cl1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop



                            )
                            Text(text = "Law",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                }




            }
            Row {
                Column {
                    Card (modifier = Modifier.clickable { navController.navigate(CATERING_URL) }.size(width = 180.dp, height = 100.dp )){

                        Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.cateriung),
                                contentDescription = "cl1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop



                            )
                            Text(text = "Catering",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Card (modifier = Modifier.clickable { navController.navigate(BUSINESS_URL) }.size(width = 180.dp, height = 100.dp )){

                        Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.business),
                                contentDescription = "cl1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop



                            )
                            Text(text = "Business",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                }


            }
            Row {
                Column {
                    Card (modifier = Modifier.size(width = 180.dp, height = 100.dp )){

                        Box (modifier = Modifier.clickable { navController.navigate(ENG_URL) }.fillMaxSize(), contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.engineering),
                                contentDescription = "cl1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop



                            )
                            Text(text = "Engineering",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Card (modifier = Modifier.size(width = 180.dp, height = 100.dp )){

                        Box (modifier = Modifier.clickable { navController.navigate(
                            ADD_ARCHITECTURE_URL) }.fillMaxSize(), contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.architecture),
                                contentDescription = "cl1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop



                            )
                            Text(text = "Architecture",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                }




            }
        }




    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme{
        HomeScreen(navController = rememberNavController())
    }
}
package com.example.wazitoecommerce.ui.theme.screens.Business

import com.example.wazitoecommerce.navigation.ATTACH_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme



import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text

import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

import com.example.wazitoecommerce.navigation.HOME_URL



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusinessScreen(navController: NavHostController){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){


        val mContext = LocalContext.current

        TopAppBar(title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                
                IconButton(onClick = { }) {}
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { navController.navigate(HOME_URL) }

                )


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
        
        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.bs1),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "StressFrama ",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Receptionists needed.",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Loacated near Muthaiga Square",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent= Intent(Intent.ACTION_DIAL )
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent) }, modifier = Modifier.padding(start = 50.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "call",
                            tint = Color.Green,
                            modifier = Modifier.
                            size(30.dp)
                        )

                    }
                }

            }

        }
        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.bs2),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Mutua Chemist",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "In need of extra pharmacist",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located at Chiromo",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent= Intent(Intent.ACTION_DIAL )
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent) }, modifier = Modifier.padding(start = 50.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "call",
                            tint = Color.Green,
                            modifier = Modifier.
                            size(30.dp)
                        )

                    }
                }

            }

        }
        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.bs3),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "KCB Bank ",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "In search of Accountants",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located in KCB Towers",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent= Intent(Intent.ACTION_DIAL )
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent) }, modifier = Modifier.padding(start = 50.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "call",
                            tint = Color.Green,
                            modifier = Modifier.
                            size(30.dp)
                        )

                    }
                }

            }

        }
        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.bs4),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Musyimi & Company ",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Houses to let.",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located at Langata",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent= Intent(Intent.ACTION_DIAL )
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent) }, modifier = Modifier.padding(start = 50.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "call",
                            tint = Color.Green,
                            modifier = Modifier.
                            size(30.dp)
                        )

                    }
                }

            }

        }
        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.bs5),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Harriet's Bakery",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Bakers needed",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located in Karen",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent= Intent(Intent.ACTION_DIAL )
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent) }, modifier = Modifier.padding(start = 50.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "call",
                            tint = Color.Green,
                            modifier = Modifier.
                            size(30.dp)
                        )

                    }
                }

            }

        }
        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.bs6),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Gikera & Vadgama Advocates",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Corporate Secretary needed",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located in Kitengela",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent= Intent(Intent.ACTION_DIAL )
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent) }, modifier = Modifier.padding(start = 50.dp)

                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = "call",
                            tint = Color.Green,
                            modifier = Modifier.
                            size(30.dp)
                        )

                    }
                }

            }

        }





    }


}
@Composable
@Preview(showBackground = true)
fun BusinessScreenPreview(){
   WazitoECommerceTheme{
        BusinessScreen(navController = rememberNavController())
    }
}
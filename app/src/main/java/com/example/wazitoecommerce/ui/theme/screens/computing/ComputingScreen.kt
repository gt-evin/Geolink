package com.example.wazitoecommerce.ui.theme.screens.computing

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
import com.example.wazitoecommerce.navigation.ATTACH_URL
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComputingScreen(navController: NavHostController){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ){

        val mContext = LocalContext.current

        TopAppBar(title = { androidx.compose.material3.Text(text = "",color = Color.White)},
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
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            Text(text = "Coding")

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Programming")

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "ICT")

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "CyberSecurity")

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Data")

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Hacking")

        }
        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier
            .padding(4.dp)
            .height(150.dp)
            .fillMaxWidth()
        ){
            Card (modifier = Modifier.size(160.dp)){
                Image(painter = painterResource(id = R.drawable.computing),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "CodeUS",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Searching for C++ user",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Loacated at Muthaiga",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL )
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
                Image(painter = painterResource(id = R.drawable.cp1),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Cloud Computing",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Programmers needed",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Main Office at Hill Towers",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL )
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
                Image(painter = painterResource(id = R.drawable.cp2),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Moringa",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Python Users only",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located near Sarit",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL )
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
                Image(painter = painterResource(id = R.drawable.cp3),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Oracle",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Any in need of a database",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located at Westlands",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL )
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
                Image(painter = painterResource(id = R.drawable.cp4),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "Scaler",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Anyone who knows coding",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Located in Kasarani",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL )
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
                Image(painter = painterResource(id = R.drawable.computing),
                    contentDescription = "comp",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))

            Column {
                Text(
                    text = "CodeUS",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Searching for C++ user",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Loacated at Muthaiga",
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Text(
                        text = "Call +254754996924",
                        fontSize = 15.sp
                    )


                    IconButton(onClick = {val callIntent=Intent(Intent.ACTION_DIAL )
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
fun ComputingScreenPreview(){
    WazitoECommerceTheme{
        ComputingScreen(navController = rememberNavController())
    }
}
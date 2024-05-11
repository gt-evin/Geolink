package com.example.wazitoecommerce.ui.theme.screens.architecture

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.data.ProductViewModel
import com.example.wazitoecommerce.models.Product
import com.example.wazitoecommerce.ui.theme.Brown
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun ViewArchitectureScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var productRepository = ProductViewModel(navController, context)


        val emptyProductState = remember { mutableStateOf(Product("","","","","")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.allProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All Designs",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(products){
                   ArchitectureItem(
                       Designer = it.name,
                       Email = it.quantity ,
                       Softwareused = it.price ,
                       id = it.id,
                       navController = navController,
                       productRepository = productRepository,
                       productImage = it.imageUrl
                   )
                }
            }
        }
    }
}


@Composable
fun ArchitectureItem(Designer:String, Email:String, Softwareused:String, id:String,
                navController:NavHostController,
                productRepository:ProductViewModel, productImage:String) {

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {


        Box(modifier = Modifier.fillMaxWidth()) {
           Image(
               painter = rememberAsyncImagePainter(productImage),
               contentDescription = null,
               modifier = Modifier
                   .size(250.dp),
           )
       }
        Row{
            Text(text = "DESIGNER NAME :")
            Text(text = Designer)

        }
        Row {
            Text(text = "DESIGNER EMAIL ADDRESS :")
            Text(text = Email)
        }
        Row {
            Text(text = "Software Used :")
            Text(text = Softwareused)
        }

        Button(onClick = {
            productRepository.deleteProduct(id)
        },colors = ButtonDefaults.buttonColors(Brown)) {
            Text(text = "Delete")
        }

    }
}

@Composable
@Preview(showBackground = true)
fun ViewArchitectureScreenPreview(){
    WazitoECommerceTheme {
        ViewArchitectureScreen(navController = rememberNavController())
    }
}
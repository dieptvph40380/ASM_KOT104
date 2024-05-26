package com.example.asm_kot104

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.media.Image

import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class Mycart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartScreen()
        }
    }
}
@Composable
fun CartScreen() {

    Column(
        modifier = Modifier

            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.padding(0.dp,0.dp,40.dp,0.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "Plus"
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text("My cart", fontSize = 20.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
        }
        CartItem(
            image = "img_1.jpg",
            title = "Minimal Stand",
            price = "$25.00",
            onPlusClick = { /* Implement plus button logic */ },
            onMinusClick = { /* Implement minus button logic */ }
        )
        Spacer(modifier = Modifier.height(16.dp))
        CartItem(
            image = "img_2.jpg",
            title = "Coffee Table",
            price = "$20.00",
            onPlusClick = { /* Implement plus button logic */ },
            onMinusClick = { /* Implement minus button logic */ }
        )
        Spacer(modifier = Modifier.height(16.dp))
        CartItem(
            image = "img_3.jpg",
            title = "Minimal Desk",
            price = "$50.00",
            onPlusClick = { /* Implement plus button logic */ },
            onMinusClick = { /* Implement minus button logic */ }
        )
        // ... Remaining code
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PromoCodeContainer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = rememberSaveable { mutableStateOf("") }.value,
            onValueChange = {},
            modifier = Modifier
                .weight(1f),

            placeholder = {
                Text("Enter your promo code")
            },

            )
        Button(
            onClick = {
                // Implement your promo code logic here
            },
            modifier = Modifier
                .size(55.dp) // Set the size of the button

                .align(Alignment.CenterVertically),
            shape = RoundedCornerShape(10.dp), // Set the shape to be square
            colors = ButtonDefaults.buttonColors(
                Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(">", fontSize = 20.sp)
        }
    }
}

@Composable
fun PromoCodeContai() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Total:", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))
        Text("\$ 95.00", fontSize = 20.sp, textAlign = TextAlign.Center,fontWeight = FontWeight.Bold)
    }
}

@Composable
fun PromoCodeCheckOut(

) {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(50.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            Color.Black,
            contentColor = Color.White
        )
    ) {
        Text("Check out")
    }
}



@Composable
fun CartItem(
    image: String,
    title: String,
    price: String,
    onPlusClick: () -> Unit,
    onMinusClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = getImageResource(image)), // Replace with your image
            contentDescription = "Item image",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(

            modifier = Modifier.weight(1f)
        ) {
            Text(title)
            Spacer(modifier = Modifier.height(4.dp))
            Text(price)
            Row( modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                IconButton(onClick = onPlusClick) {

                    Icon(imageVector = Icons.Default.Add, contentDescription = "Plus")
                }
                Text("1")
                IconButton(onClick = onMinusClick) {
                    contentColorFor(backgroundColor = Color.Black)

                    Icon(imageVector = Icons.Default.Delete, contentDescription = "Minus")

                }
            }
        }
        IconButton(onClick = onMinusClick) {
            Icon(imageVector = Icons.Default.Close, contentDescription = "Minus")

        }

    }
}
private fun getImageResource(imageName: String): Int {
    return when (imageName) {
        "img_1.jpg" -> R.drawable.icon
        "img_2.jpg" -> R.drawable.icon
        "img_3.jpg" -> R.drawable.icon
        else -> R.drawable.icon
    }
}

//@Preview(showBackground = true)
//@Composable
//fun layoutcheck() {
//    ASM_KOT104Theme {
//        Column {
//            Column(modifier = Modifier.weight(1f) ) {
//                CartScreen()
//            }
//
//            PromoCodeContainer()
//            PromoCodeContai()
//            PromoCodeCheckOut()
//        }
//    }
//}
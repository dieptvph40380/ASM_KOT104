package com.example.asm_kot104

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow.Companion.Clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button

import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable

import androidx.compose.ui.draw.clip

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Column(modifier = Modifier.weight(1f) ) {
                    CartScreen6()
                }
                CartScreen4()
                ContactCard()
                CartScreen5()
                PromoCodeContainer5()
                CartScreen7()


                PromoCodeContainer7()
                BoGocContainer()
                PromoCodeCheckOut7()
            }
        }
    }

}


@Composable
fun ContactCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Bruno Fernandes",
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                color = Color.Gray,
                thickness = 1.dp
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "25 rue Robert Latouche, Nice, 06200, Côte D'azur, France",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.Gray
                    )
                )
            }
        }
    }
}
@Composable
fun CartScreen6() {

    Column(
        modifier = Modifier

            .padding(15.dp)
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
            Text("Check Out", fontSize = 20.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun CartScreen7() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Delivery method", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))


            Icon(
                modifier = Modifier
                    .size(24.dp), // Set the size of the icon
                imageVector = Icons.Default.Create,
                contentDescription = "Minus"
            )
            Spacer(modifier = Modifier.width(8.dp)) // Add some spacing between the icon and text
            Text(
                "",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}
@Composable
fun CartScreen4() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Shipping Address", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))


            Icon(
                modifier = Modifier
                    .size(24.dp), // Set the size of the icon
                imageVector = Icons.Default.Create,
                contentDescription = "Minus"
            )
            Spacer(modifier = Modifier.width(8.dp)) // Add some spacing between the icon and text
            Text(
                "",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}
@Composable
fun CartScreen5() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Payment", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))


            Icon(
                modifier = Modifier
                    .size(24.dp), // Set the size of the icon
                imageVector = Icons.Default.Create,
                contentDescription = "Minus"
            )
            Spacer(modifier = Modifier.width(8.dp)) // Add some spacing between the icon and text
            Text(
                "",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}
@Composable
fun PromoCodeContainer5() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TextField(
            value = rememberSaveable { mutableStateOf("") }.value,
            onValueChange = {},
            modifier = Modifier
                .weight(1f),

            placeholder = {
                Text("Enter your promo code")
            },

            )


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PromoCodeContainer7() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TextField(
            value = rememberSaveable { mutableStateOf("") }.value,
            onValueChange = {},
            modifier = Modifier
                .weight(1f),

            placeholder = {
                Text("Enter your promo code")
            },

            )


    }
}

@Composable
fun BoGocContainer() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp)
            .clip(RoundedCornerShape(10.dp)) // Thêm bo góc 8dp cho cả 3 dòng
            .background(color = Color.White)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text("Total:", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))
                Text("\$ 95.00", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text("Total:", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))
                Text("\$ 95.00", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text("Total:", fontSize = 20.sp, textAlign = TextAlign.Start, modifier = Modifier.weight(1f))
                Text("\$ 95.00", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoGocContainerPreview() {
    BoGocContainer()
}




@Composable
fun PromoCodeCheckOut7(

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
        Text("SUBMIT ORDER")
    }
}







@Composable
fun CartItem7(
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
        else -> R.drawable.bookmark
    }
}
@Preview(showBackground = true)
@Composable
fun layoutcheck() {
    ASM_KOT104Theme {
        Column {
            Column(modifier = Modifier.weight(1f) ) {
                CartScreen6()
            }
            CartScreen4()
            ContactCard()
            CartScreen5()
            PromoCodeContainer5()
            CartScreen7()


            PromoCodeContainer7()
            BoGocContainer()
            PromoCodeCheckOut7()
        }
    }
}
package com.example.asm_kot104

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class Congrats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            test()
        }
    }
}
@Composable
fun test(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Căn chỉnh theo chiều ngang
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
        ) {
            Text(text = "SUCCESS!", fontSize = 30.sp , fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(65.dp))
            Box {
                Image(
                    painter = painterResource(id = R.drawable.congrats),
                    contentDescription = "",
                    modifier = Modifier.size(200.dp) // Kích thước của ảnh lớn
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icon),
                        contentDescription = "",
                        modifier = Modifier.size(80.dp) // Kích thước của ảnh nhỏ
                    )
                    Image(
                        painter = painterResource(id = R.drawable.icon),
                        contentDescription = "",
                        modifier = Modifier.size(80.dp) // Kích thước của ảnh nhỏ
                    )
                }

            }
            Spacer(modifier = Modifier.height(35.dp))
            Text(text = "Your order will be delivered soon. \nThank you for choosing our app!")
            Spacer(modifier = Modifier.height(65.dp))
            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(55.dp)
                    .width(320.dp),
                onClick = { /* Handle click event */ },
                colors = ButtonDefaults.buttonColors(
                    Color.Black,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(5.dp), // Bo góc nút
            ) {
                Text(text = "Track your orders", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(35.dp))
            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(320.dp)
                    .height(55.dp)
                    .border(
                        width = 1.dp, // Độ rộng của viền
                        color = Color.Black, // Màu của viền
                        shape = RoundedCornerShape(5.dp)
                    ), // Bo góc viền),
                onClick = { /* Handle click event */ },
                colors = ButtonDefaults.buttonColors(
                    Color.White,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(5.dp), // Bo góc nút
            ) {
                Text(text = "BACK TO HOME", fontSize = 18.sp)
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun layoutcheck() {
//    ASM_KOT104Theme {
//        test()
//    }
//}
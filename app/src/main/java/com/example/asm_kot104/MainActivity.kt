package com.example.asm_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                BackgroundImage()
            }
        }

}
@Composable
fun BackgroundImage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)// Thêm màu nền đen cho Box
    ) {
        Image(
            painter = painterResource(id = R.drawable.img1),
            contentDescription = "Background Image",
            modifier = Modifier
                .fillMaxWidth()
                .alpha(0.5f), // Giảm độ trong suốt của ảnh nền
            contentScale = ContentScale.Crop// Căn chỉnh ảnh để khít màn hình
        )
        Column(
            Modifier.align(Alignment.Center)

        ) {
            ContentAndButton1(
                modifier = Modifier.align(Alignment.Start).padding(start = 5.dp)

            )
            ContentAndButton2(
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(start = 45.dp, end = 45.dp )
            )
        }


    }
}
@Composable
fun ContentAndButton1(modifier: Modifier) {
    Box(
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier.padding(start = 5.dp) // Add padding to the start of the column
        ) {
            Text(
                text = "MAKE YOUR",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "HOME BEAUTIFUL",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
@Composable
fun ContentAndButton2(modifier: Modifier) {
    Box(
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier // Add padding to the start of the column
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Text(

                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
                fontSize = 24.sp,
                fontStyle = FontStyle.Italic,

            )
            Spacer(modifier = Modifier.height(62.dp)) // Added space before the button
            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { /* Handle click event */ },
                colors = ButtonDefaults.buttonColors(
                    Color.Black,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(5.dp), // Bo góc nút
            ) {
                Text(text = "Get Started", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun layout(){
//    ASM_KOT104Theme {
//        BackgroundImage()
//    }
//}
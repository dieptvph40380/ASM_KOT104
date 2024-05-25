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
import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ASM_KOT104Theme {

                // A surface container using the 'background' color from the theme

        }
    }

}

}
//@Composable
//fun CircleButtonColumn() {
//    Box(
//        modifier = Modifier
//            .background(Color.Gray)
//            .padding(vertical = 24.dp)
//            .shadow(5.dp, shape = RoundedCornerShape(10.dp)) // Hiệu ứng nổi cho Box
//            .background(Color.White, shape = RoundedCornerShape(8.dp))
//            .padding(3.dp),
//        contentAlignment = Alignment.Center
//    ) {
//        Column(
//            modifier = Modifier
//                .background(Color.White)
//                .padding(vertical = 24.dp),
//            verticalArrangement = Arrangement.spacedBy(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            CircleButton(Color.Gray) {
//                // Handle button click
//            }
//            CircleButton(Color(0xFF8B5A2B)) { // Màu nâu
//                // Handle button click
//            }
//            CircleButton(Color(0xFFF5DEB3)) { // Màu be
//                // Handle button click
//            }
//        }
//    }
//}

//@Composable
//fun CircleButton(color: Color, onClick: () -> Unit) {
//
//        Button(
//            onClick = onClick,
//            modifier = Modifier
//                .size(64.dp), // Kích thước của nút bấm
//            shape = CircleShape,
//            colors = ButtonDefaults.buttonColors(containerColor = color),
//
//        ) {
//            // Nội dung của nút bấm (để trống)
//        }
//
//
//}
//@Preview(showBackground = true)
//@Composable
//fun layoutcheck() {
//    ASM_KOT104Theme {
//        CircleButtonColumn()
//    }
//}
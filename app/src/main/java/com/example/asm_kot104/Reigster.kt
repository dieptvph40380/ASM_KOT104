package com.example.asm_kot104

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class Reigster : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeaderLayoutRE()
        }
    }

}
@Composable
fun HeaderLayoutRE() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.padding(16.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Canvas(
                        modifier = Modifier
                            .width(135.dp)
                            .height(60.dp)
                    ) {
                        drawLine(
                            color = Color.LightGray,
                            start = Offset(0f, size.height / 2),
                            end = Offset(size.width, size.height / 2),
                            strokeWidth = 6f
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "acxxc",
                        modifier = Modifier.size(60.dp)
                    )
                    Canvas(
                        modifier = Modifier
                            .width(135.dp)
                            .height(60.dp)
                    ) {
                        drawLine(
                            color = Color.LightGray,
                            start = Offset(0f, size.height / 2),
                            end = Offset(size.width, size.height / 2),
                            strokeWidth = 6f
                        )
                    }

                }
                Text(text = "WELLCOME !", fontSize = 25.sp)
            }
        }
        BoxScreenRe()
    }
}
@Composable
fun BoxScreenRe() {
    // Hộp chứa nổi lên
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(400.dp)
            .background(Color.White) // Màu nền của hộp nổi lên
            .shadow( // Hiệu ứng đổ bóng
                elevation = 1.dp,
                spotColor = Color.LightGray
            )
    ) {

            Column(modifier = Modifier.padding(start = 10.dp, top = 10.dp, end = 1.dp)) {

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("Name") },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color("#E0E0E0".toColorInt()),
                        focusedIndicatorColor = Color.Gray
                    ),

                    )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("Email") },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color("#E0E0E0".toColorInt()),
                        focusedIndicatorColor = Color.Gray
                    ),

                    )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    placeholder = { Text("Password") },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color("#E0E0E0".toColorInt()),
                        focusedIndicatorColor = Color.Gray
                    ),
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.eye),
                            contentDescription = "Show/Hide Password",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    placeholder = { Text("Confirm Password") },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color("#E0E0E0".toColorInt()),
                        focusedIndicatorColor = Color.Gray
                    ),
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.eye),
                            contentDescription = "Show/Hide Password",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                )
                FooterRe()
            }

        }

    }
@Composable
fun FooterRe() {
    Box(
        modifier = Modifier.fillMaxSize()
        // Ensure the Box takes the full size

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Center the content horizontally
            modifier = Modifier.align(Alignment.Center) // Center the Column in the Box
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .height(48.dp)
                    .width(200.dp),
                colors = ButtonDefaults.buttonColors(
                    Color.Black,
                    contentColor = Color.White
                ),
            ) {
                Text(text = "SIGN UP")
            }
            Row(){
                Text(
                    text = "Already have account? ",
                    modifier = Modifier.padding(top = 16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "SIGN IN",
                    modifier = Modifier.padding(top = 16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }

        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun layout(){
//    ASM_KOT104Theme {
//        HeaderLayoutRE()
//    }
//}
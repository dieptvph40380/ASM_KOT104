package com.example.asm_kot104

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.asm_kot104.ui.theme.ASM_KOT104Theme

class Product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ProductScreen() }
    }
}

@Composable
fun ProductScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color.Transparent)

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                // Hình ảnh sản phẩm
                Image(
                    painter = painterResource(id = R.drawable.mask_group),
                    contentDescription = "Hình ảnh sản phẩm",
                    modifier = Modifier
                        .clip(RoundedCornerShape(bottomStart = 60.dp))
                        .height(350.dp)
                        .width(300.dp)
                        .align(Alignment.TopEnd),
                    contentScale = ContentScale.Crop

                )
                // Nút trở về
                Column {
                    IconButton(
                        onClick = { /* Không có chức năng */ },
                        modifier = Modifier
                            .padding(start = 33.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.White)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "Trở về",
                            modifier = Modifier.size(100.dp)
                            )
                    }
                    CircleButtonColumn()
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            // Tên sản phẩm
            Text(
                text = "Minimal Stand",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Giá sản phẩm
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Căn đầu dòng
            ) {
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "$50",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Box {
                    Row {
                        Button(
                            onClick = { /* Không có chức năng */ },
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "+",
                                color = Color.Black,
                                fontSize = 23.sp,
                                modifier = Modifier.padding(end = 1.dp),
                            )
                        }
                        Text(
                            modifier = Modifier.padding(top = 8.dp),
                            text = "01",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Button(
                            onClick = { /* Không có chức năng */ },
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(text = "-", color = Color.Black, fontSize = 23.sp)
                        }
                    }
                }

            }


            Spacer(modifier = Modifier.height(8.dp))

            // Đánh giá sản phẩm
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.start),
                    contentDescription = "Sao",
                    tint = Color.Yellow,
                    modifier = Modifier.size(35.dp)
                )
                Text(text = "4.5", fontSize = 16.sp ,modifier = Modifier.padding(start =20.dp))
                Text(text = "(50 đánh giá)", fontSize = 16.sp, color = Color.Gray)
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Mô tả sản phẩm
            Text(
                text = "Minimal Stand được làm từ gỗ tự nhiên. Thiết kế rất đơn giản và tối giản. Đây thực sự là một trong những món đồ nội thất tốt nhất trong bất kỳ gia đình nào hiện nay. Với 3 màu sắc khác nhau, bạn có thể dễ dàng chọn lựa phù hợp nhất cho ngôi nhà của mình.",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Bộ chọn số lượng


            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Căn đầu dòng
                // Căn giữa theo chiều dọc
            ) {
                // Nút thêm vào giỏ hàng
                Button(
                    onClick = { /* Không có chức năng */ },
                    modifier = Modifier
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bookmark), // Thay thế bằng ID thực tế của bạn
                        contentDescription = "Bookmark Icon",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(20.dp) // Kích thước hình ảnh
                    )
                }
                // Nút thêm vào giỏ hàng
                Button(
                    onClick = { /* Không có chức năng */ },
                    modifier = Modifier
                        .width(260.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Add to cart", color = Color.White, fontSize = 16.sp)
                }
            }
        }
    }
}

@Composable
fun CircleButtonColumn() {
    Box(
        modifier = Modifier
        .background(Color.Transparent)
        .padding(start = 36.dp, top = 40.dp),
        ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(5.dp),
        ) {
            Button(
                onClick = { /* Không có chức năng */ },
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),

                ) {

            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = { /* Không có chức năng */ },
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan),

                ) {

            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = { /* Không có chức năng */ },
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta),

                ) {

            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun layoutcheck() {
//    ASM_KOT104Theme {
//        ProductScreen()
//    }
//}
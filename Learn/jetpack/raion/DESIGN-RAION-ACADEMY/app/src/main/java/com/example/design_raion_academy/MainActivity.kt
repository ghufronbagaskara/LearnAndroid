package com.example.design_raion_academy

import android.graphics.Paint.Align
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design_raion_academy.models.Dessert
import com.example.design_raion_academy.models.DessertsData
import com.example.design_raion_academy.ui.theme.DESIGNRAIONACADEMYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DESIGNRAIONACADEMYTheme {
                // State Hoisting = State seperti var sold count disimpan disini
                var soldCount by remember {  //-> ini adalah state yang akan menunjukan status
                    mutableStateOf(0)
                }

                var currentDessert by remember {
                    mutableStateOf(DessertsData.desserts[0])
                }

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    bakeryContent(
                        onClick = {
                            soldCount++

                            // CEK BERAPA YANG TELAH TERJUAL
                            for (currCake in DessertsData.desserts){
                                if (soldCount >= currCake.minimumSold){
                                    currentDessert = currCake
                                }
                            }
                        },
                        dessert = currentDessert,
                        soldCount = soldCount
                    )
                }
            }
        }
    }
}

@Composable
fun bakeryContent(
    dessert: Dessert,
    onClick: () -> Unit,
    soldCount: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(id = R.drawable.bakery_back),
            contentDescription = "Background",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(340.dp)
                .align(Alignment.Center)
                .padding(
                    bottom = 130.dp
                )
            ) {
            Image(
                painter = painterResource(id = dessert.image),
                contentDescription = "Bakery Cake Button",
            )
        }
        Box(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 8.dp,
                        topEnd = 8.dp
                    )
                )
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.White)
        ) {
            Text(
                text = "Dessert Sold",
                fontSize = 25.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .padding(bottom = 80.dp)
                    .padding(start = 14.dp)
                    .align(Alignment.TopStart)
                    .alpha(250F)
            )
            Text(
                text = soldCount.toString(),
                fontSize = 28.sp,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 12.dp)
                    .padding(top = 14.dp)
            )
            Text(
                text = "$${dessert.price}",
                fontSize = 40.sp,
                color = Color(0xFF77AB59),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 10.dp)
                    .padding(end = 7.dp)
            )

        }
    }
}

//@Preview(device = Devices.PIXEL_4)
//@Composable
//fun bakeryContentPreview1() {
//    DESIGNRAIONACADEMYTheme {
//        bakeryContent(
//            onClick = {},
//            DessertsData.desserts[0],
//            0
//        )
//    }
//}

//@Preview(device = Devices.FOLDABLE)
//@Composable
//fun bakeryContentPreview2() {
//    DESIGNRAIONACADEMYTheme {
//        bakeryContent()
//    }
//}


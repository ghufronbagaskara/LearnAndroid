package com.example.raion_academy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.raion_academy.ui.theme.RAION_ACADEMYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RAION_ACADEMYTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Box(         //////////////////////////
                        modifier = Modifier
                            .fillMaxSize(),
                    ) {
                        //BACKGROUND IMAGE
                        Image(
                            painter = painterResource(id = R.drawable.gambar_buat_tes),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .alpha(0.5f),
                            contentScale = ContentScale.Crop
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)
                                .padding(
                                    bottom = 50.dp
                                ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            //PROFILE ICON
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Icon Akun",
                                modifier = Modifier.size(150.dp)
                            )
                            Spacer(modifier = Modifier.height(12.dp))

                            //NAMA PROFILE
                            Text(
                                text = "Ghufron Bagaskara",
                                fontSize = 29.sp
                            )
                            Spacer(modifier = Modifier.height(12.dp))

                            //ROW ICON
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 36.dp),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                //ICON CREATE
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.Create,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier.size(50.dp)
                                    )
                                    Text(text = "Create")
                                }
                                //ICON SETTINGS
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        imageVector = Icons.Filled.AddCircle,
                                        contentDescription = "",
                                        modifier = Modifier.size(50.dp)
                                    )
                                    Text(text = "Add")
                                }
                                //ICON SETTINGS
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        imageVector = Icons.Filled.Settings,
                                        contentDescription = "",
                                        modifier = Modifier.size(50.dp)
                                    )
                                    Text(text = "Setting")
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RAION_ACADEMYTheme {
        Greeting("Android")
    }
}
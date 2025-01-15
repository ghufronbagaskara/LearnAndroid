package com.example.loginpageuilover

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpageuilover.ui.theme.LoginPageUiLoverTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPageUiLoverTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    login()
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun login() {
        Column(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(id = R.drawable.top_mono),
                contentDescription = "Top Background"
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.height(150.dp)
            )
            Text(
                "Welcome to Supportive",
                fontSize = 28.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#36454f")),
                modifier = Modifier.padding(top = 10.dp, bottom = 7.dp)
            )

            var user by remember { mutableStateOf("Username") }
            var pass by remember { mutableStateOf("Password") }
            var passwordVisible by rememberSaveable() { mutableStateOf(false) }
            TextField(
                value = user,
                { text -> user = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp)
                    .border(
                        1.dp, Color(android.graphics.Color.parseColor("#36454f")),
                        shape = RoundedCornerShape(50)
                    ),
                shape = RoundedCornerShape(50),
                textStyle = androidx.compose.ui.text.TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color(android.graphics.Color.parseColor("#36454f")),
                    fontSize = 14.sp
                ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            TextField(
                value = pass,
                { text -> pass = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp)
                    .border(
                        1.dp, Color(android.graphics.Color.parseColor("#36454f")),
                        shape = RoundedCornerShape(50)
                    ),
                shape = RoundedCornerShape(50),
                textStyle = androidx.compose.ui.text.TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color(android.graphics.Color.parseColor("#36454f")),
                    fontSize = 14.sp
                ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Button(
                onClick = { /*TODO*/ },
                Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(start = 64.dp, end = 64.dp, bottom = 8.dp, top = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        android.graphics.Color.parseColor(
                            "#36454f"
                        )
                    )
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                text = "Don't remember password? click here",
                Modifier.padding(top = 8.dp, bottom = 8.dp),
                fontSize = 14.sp,
                color = Color(android.graphics.Color.parseColor("#36454f"))
            )
            Row(
                Modifier
                    .padding(top = 15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = null,
                    Modifier
                        .padding(8.dp)
                        .size(size = 55.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = null,
                    Modifier
                        .padding(8.dp)
                        .size(size = 55.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = null,
                    Modifier
                        .padding(8.dp)
                        .size(size = 55.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.bottom_mono),
                contentDescription = "",
                contentScale = ContentScale.FillBounds
            )
        }
    }
}



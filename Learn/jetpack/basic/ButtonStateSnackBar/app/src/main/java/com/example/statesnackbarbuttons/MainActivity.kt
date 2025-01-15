package com.example.statesnackbarbuttons

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var textFieldState by remember {
                mutableStateOf("")
            }
            val snackbarHostState = remember {
                SnackbarHostState()
            }
            val coroutineScope = rememberCoroutineScope()
            
            StateButton(
                snackbarHostState = snackbarHostState,
                coroutineScope = coroutineScope,
                textFieldState = textFieldState,
                onTextFieldValueChange = {textFieldState = it}
            )

        }
    }
}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun StateButton(
    snackbarHostState: SnackbarHostState,
    coroutineScope: CoroutineScope,
    textFieldState: String,
    onTextFieldValueChange: (String) -> Unit
) {
    Scaffold(
        snackbarHost = { SnackbarHost(
            hostState = snackbarHostState
        ) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = textFieldState,
                onValueChange = onTextFieldValueChange,
                label = {
                    Text(text = "Enter your name")
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    coroutineScope.launch {
                        snackbarHostState.showSnackbar("Hello $textFieldState, How r u today?")
                    }
                }
            ) {
                Text(text = "Greet me !")
            }
        }
    }
}




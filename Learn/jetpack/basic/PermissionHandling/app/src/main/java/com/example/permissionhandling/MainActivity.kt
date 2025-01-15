package com.example.permissionhandling

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.example.permissionhandling.ui.theme.PermissionHandlingTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.google.accompanist.permissions.shouldShowRationale

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPermissionsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PermissionHandlingTheme {
                val permissionState = rememberMultiplePermissionsState(
                    permissions = listOf(
                        Manifest.permission.RECORD_AUDIO,
                        Manifest.permission.CAMERA
                    )
                )

                val lifecycleOwner = LocalLifecycleOwner.current
                DisposableEffect(
                    key1 = lifecycleOwner,
                    effect = {
                        val observer = LifecycleEventObserver { _, event ->
                            if (event == Lifecycle.Event.ON_RESUME) {
                                permissionState.launchMultiplePermissionRequest()
                            }
                        }
                        lifecycleOwner.lifecycle.addObserver(observer)

                        onDispose {
                            lifecycleOwner.lifecycle.removeObserver(observer)
                        }
                    }
                )

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    permissionState.permissions.forEach { perm ->
                        when (perm.permission) {
                            Manifest.permission.CAMERA -> {
                                when {
                                    perm.status.isGranted -> {
                                        Text(text = "Camera permission accepted")
                                    }

                                    perm.status.shouldShowRationale -> {
                                        Text(text = "Camera permission is needed " + "to access the camera")
                                    }

                                    perm.isPermanentlyDenied() -> {
                                        Text(text = "Camera permission was permanently denied " + "enable it in the app settings")
                                    }
                                }
                            }

                            Manifest.permission.RECORD_AUDIO -> {
                                when {
                                    perm.status.isGranted -> {
                                        Text(text = "Audio Record permission accepted")
                                    }

                                    perm.status.shouldShowRationale -> {
                                        Text(text = "Audio Record permission is needed " + "to access the camera")
                                    }

                                    perm.isPermanentlyDenied() -> {
                                        Text(text = "Audio Record permission was permanently denied " + "enable it in the app settings")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
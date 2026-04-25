package com.laba1.lab1

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import co.touchlab.kermit.Logger
import lab1.composeapp.generated.resources.Res
import lab1.composeapp.generated.resources.compose_multiplatform


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import com.laba1.lab1.ui.screens.AppNavigation
import com.laba1.lab1.ui.theme.AppTheme



@Composable
@Preview
fun App() {
    AppTheme {
        AppNavigation()
    }
}
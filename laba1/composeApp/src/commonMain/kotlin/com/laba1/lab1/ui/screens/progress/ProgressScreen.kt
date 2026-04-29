package com.laba1.lab1.ui.screens.progress

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProgressScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Indeterminate Progress (нескінченне завантаження):")

        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.primary
        )

        LinearProgressIndicator(
            modifier = Modifier.fillMaxWidth()
        )

        Text("Determined Progress (заданий рівень - 70%):", modifier = Modifier.padding(top = 16.dp))

        LinearProgressIndicator(
            progress = { 0.7f },
            modifier = Modifier.fillMaxWidth(),
        )
    }
}
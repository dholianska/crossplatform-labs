package com.laba1.lab1.ui.screens.dividers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DividersScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Звичайний розділювач:")
        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

        Text("Розділювач із заданою товщиною (4.dp):", modifier = Modifier.padding(top = 16.dp))
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 4.dp,
            color = MaterialTheme.colorScheme.primary
        )

        Text("Розділювач з кастомним кольором:", modifier = Modifier.padding(top = 16.dp))
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            color = MaterialTheme.colorScheme.secondary
        )
    }
}
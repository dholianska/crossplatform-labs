package com.laba1.lab1.ui.screens.timepickers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickersScreen() {
    val timePickerState = rememberTimePickerState(
        initialHour = 12,
        initialMinute = 30,
        is24Hour = true
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Виберіть час:",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TimePicker(state = timePickerState)

        Text(
            "Обрано: ${timePickerState.hour}:${timePickerState.minute.toString().padStart(2, '0')}",
            modifier = Modifier.padding(top = 16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
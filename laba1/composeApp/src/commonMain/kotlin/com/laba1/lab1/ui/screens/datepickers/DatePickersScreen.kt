package com.laba1.lab1.ui.screens.datepickers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickersScreen() {
    val datePickerState = rememberDatePickerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        DatePicker(
            state = datePickerState,
            modifier = Modifier.padding(16.dp)
        )

    }
}
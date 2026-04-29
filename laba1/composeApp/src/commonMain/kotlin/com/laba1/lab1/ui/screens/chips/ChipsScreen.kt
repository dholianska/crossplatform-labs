package com.laba1.lab1.ui.screens.chips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ChipsScreen() {
    var selected by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        AssistChip(
            onClick = { /* Дія */ },
            label = { Text("Assist Chip") },
            leadingIcon = {
                Icon(Icons.Filled.Settings, contentDescription = null)
            }
        )

        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter Chip") },
            leadingIcon = if (selected) {
                { Icon(Icons.Filled.Check, contentDescription = null) }
            } else null
        )

        InputChip(
            selected = true,
            onClick = { },
            label = { Text("Input Chip") },
            trailingIcon = { Icon(Icons.Filled.Check, contentDescription = null) }
        )

        SuggestionChip(
            onClick = { },
            label = { Text("Suggestion Chip") }
        )
    }
}
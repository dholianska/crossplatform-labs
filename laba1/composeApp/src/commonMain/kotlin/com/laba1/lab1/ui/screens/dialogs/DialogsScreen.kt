package com.laba1.lab1.ui.screens.dialogs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DialogsScreen() {
    var showAlertDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(onClick = { showAlertDialog = true }) {
            Text("Show Alert Dialog")
        }

        if (showAlertDialog) {
            AlertDialog(
                icon = { Icon(Icons.Default.Info, contentDescription = null) },
                title = { Text("Діалогове вікно") },
                text = { Text("Це приклад Alert Dialog. Ви хочете продовжити?") },
                onDismissRequest = { showAlertDialog = false },
                confirmButton = {
                    TextButton(onClick = { showAlertDialog = false }) {
                        Text("Підтвердити")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showAlertDialog = false }) {
                        Text("Відміна")
                    }
                }
            )
        }
    }
}
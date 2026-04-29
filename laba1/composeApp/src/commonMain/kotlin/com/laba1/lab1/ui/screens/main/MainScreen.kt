package com.laba1.lab1.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lab1.composeapp.generated.resources.Res
import lab1.composeapp.generated.resources.buttons
import lab1.composeapp.generated.resources.checkboxes
import lab1.composeapp.generated.resources.chips
import lab1.composeapp.generated.resources.date_pickers
import lab1.composeapp.generated.resources.dialogs
import lab1.composeapp.generated.resources.dividers
import lab1.composeapp.generated.resources.progress
import lab1.composeapp.generated.resources.radio_buttons
import lab1.composeapp.generated.resources.switches
import lab1.composeapp.generated.resources.time_pickers
import org.jetbrains.compose.resources.stringResource

@Composable
fun MainScreen(
    onButtonsClicked: () -> Unit,
    onCheckboxesClicked: () -> Unit,
    onChipsClicked: () -> Unit,
    onDatePickersClicked: () -> Unit,
    onDialogsClicked: () -> Unit,
    onDividersClicked: () -> Unit,
    onProgressClicked: () -> Unit,
    onRadioButtonsClicked: () -> Unit,
    onSwitchesClicked: () -> Unit,
    onTimePickersClicked: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                onButtonsClicked()
            }
        ) {
            Text(stringResource(Res.string.buttons))
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                onCheckboxesClicked()
            }
        ) {
            Text(stringResource(Res.string.checkboxes))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onChipsClicked() }
        ) {
            Text(stringResource(Res.string.chips))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onDatePickersClicked() }
        ) {
            Text(stringResource(Res.string.date_pickers))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onDialogsClicked() }
        ) {
            Text(stringResource(Res.string.dialogs))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onDividersClicked() }
        ) {
            Text(stringResource(Res.string.dividers))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onProgressClicked() }
        ) {
            Text(stringResource(Res.string.progress))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onRadioButtonsClicked() }
        ) {
            Text(stringResource(Res.string.radio_buttons))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onSwitchesClicked() }
        ) {
            Text(stringResource(Res.string.switches))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onTimePickersClicked() }
        ) {
            Text(stringResource(Res.string.time_pickers))
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen(
        onButtonsClicked = {},
        onCheckboxesClicked = {},
        onChipsClicked = {},
        onDatePickersClicked = {},
        onDialogsClicked = {},
        onDividersClicked = {},
        onProgressClicked = {},
        onRadioButtonsClicked = {},
        onSwitchesClicked = {},
        onTimePickersClicked = {}
    )
}
package com.laba1.lab1.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import lab1.composeapp.generated.resources.*
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource
import com.laba1.lab1.ui.screens.buttons.ButtonsScreen
import com.laba1.lab1.ui.screens.checkboxes.CheckboxesScreen
import com.laba1.lab1.ui.screens.chips.ChipsScreen
import com.laba1.lab1.ui.screens.main.MainScreen

enum class AppScreen(val title: StringResource) {
    Main(title = Res.string.main),
    Buttons(title = Res.string.buttons),
    Checkboxes(title = Res.string.checkboxes),
    Chips(title = Res.string.chips),
    DatePickers(title = Res.string.date_pickers),
    Dialogs(title = Res.string.dialogs),
    Dividers(title = Res.string.dividers),
    Progress(title = Res.string.progress),
    RadioButtons(title = Res.string.radio_buttons),
    Switches(title = Res.string.switches),
    TimePickers(title = Res.string.time_pickers)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    currentScreen: AppScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(Res.string.back)
                    )
                }
            }
        })
}

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = AppScreen.valueOf(
        backStackEntry?.destination?.route ?: AppScreen.Main.name
    )

    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        topBar = {
            AppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() })

        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = AppScreen.Main.name,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {
            composable(route = AppScreen.Main.name) {
                MainScreen(
                    onButtonsClicked = {navController.navigate(AppScreen.Buttons.name)},
                    onCheckboxesClicked = {navController.navigate(AppScreen.Checkboxes.name)},
                    onChipsClicked = { navController.navigate(AppScreen.Chips.name) },
                    onDatePickersClicked = {navController.navigate(AppScreen.DatePickers.name)},
                    onDialogsClicked = { navController.navigate(AppScreen.Dialogs.name) },
                    onDividersClicked = { navController.navigate(AppScreen.Dividers.name) },
                    onProgressClicked = { navController.navigate(AppScreen.Progress.name) },
                    onRadioButtonsClicked = { navController.navigate(AppScreen.RadioButtons.name) },
                    onSwitchesClicked = { navController.navigate(AppScreen.Switches.name) },
                    onTimePickersClicked = { navController.navigate(AppScreen.TimePickers.name) }
                )
            }
            composable(route = AppScreen.Buttons.name) {
                ButtonsScreen(
                    onFilledButtonClicked = { text ->
                        scope.launch {
                            snackbarHostState
                                .showSnackbar(
                                    message = text,
                                    duration = SnackbarDuration.Short
                                )
                        }
                    }
                )
            }
            composable(route = AppScreen.Checkboxes.name) {
                CheckboxesScreen()
            }
            composable(route = AppScreen.Chips.name) {
                ChipsScreen()
            }
            composable(route = AppScreen.DatePickers.name) {
                com.laba1.lab1.ui.screens.datepickers.DatePickersScreen()
            }
            composable(route = AppScreen.Dialogs.name) {
                com.laba1.lab1.ui.screens.dialogs.DialogsScreen()
            }
            composable(route = AppScreen.Dividers.name) {
                com.laba1.lab1.ui.screens.dividers.DividersScreen()
            }
            composable(route = AppScreen.Progress.name) {
                com.laba1.lab1.ui.screens.progress.ProgressScreen()
            }
            composable(route = AppScreen.RadioButtons.name) {
                com.laba1.lab1.ui.screens.radiobuttons.RadioButtonsScreen()
            }
            composable(route = AppScreen.Switches.name) {
                com.laba1.lab1.ui.screens.switches.SwitchesScreen()
            }
            composable(route = AppScreen.TimePickers.name) {
                com.laba1.lab1.ui.screens.timepickers.TimePickersScreen()
            }
        }
    }
}
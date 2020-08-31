package com.app.gmailcompose.state

import androidx.compose.runtime.mutableStateListOf
import com.app.gmailcompose.model.DrawerData

class DrawerUiState(
    drawerOptions: List<DrawerData>,
) {
    private val _drawerOptions: MutableList<DrawerData> =
        mutableStateListOf(*drawerOptions.toTypedArray())
    val drawerOptions: List<DrawerData> = _drawerOptions
}
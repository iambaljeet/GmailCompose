package com.app.gmailcompose.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.ScrollState
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp


@Composable
fun ExpandableFab(scrollState: ScrollState) {
    if (scrollState.value > 100) {
        FloatingActionButton(
            onClick = {},
            icon = {
                Icon(asset = Icons.Default.Edit)
            },
            backgroundColor = MaterialTheme.colors.surface,
        )
    } else {
        ExtendedFloatingActionButton(
            text = {
                SingleLineText(
                    text = "Compose",
                    fontSize = 16.sp
                )
            },
            onClick = {},
            icon = {
                Icon(asset = Icons.Default.Edit)
            },
            backgroundColor = MaterialTheme.colors.surface,
        )
    }
}
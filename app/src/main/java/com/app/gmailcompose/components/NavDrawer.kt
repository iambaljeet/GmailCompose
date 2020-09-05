package com.app.gmailcompose.components

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gmailcompose.state.DrawerUiState

@Composable
fun NavDrawer(
    uiState: DrawerUiState
) {
    Surface(color = MaterialTheme.colors.background) {
        ScrollableColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                    .fillMaxWidth()
            ) {
                SeparatorSpacer(modifier = Modifier.height(10.dp))
                SingleLineText(
                    text = "Gmail",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp)
                )
                SeparatorSpacer(modifier = Modifier.height(10.dp))
                SeparatorDivider()
                uiState.drawerOptions.forEach { drawerData ->
                    if (drawerData.isDivider) {
                        SeparatorDivider()
                    } else {
                        DrawerMenuOptionItem(
                            listLabel = drawerData.title,
                            icon = drawerData.icon
                        )
                    }
                }
            }
        }
    }
}
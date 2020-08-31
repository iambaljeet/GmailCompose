package com.app.gmailcompose.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorAsset

data class DrawerData(
    val icon: VectorAsset ? = null,
    val title: String? = null,
    val count: Long = -1,
    val labelColor: Color? = null,
    val isDivider: Boolean = false
)
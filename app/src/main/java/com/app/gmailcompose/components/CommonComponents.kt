package com.app.gmailcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageAsset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun CircularImage(imageAsset: ImageAsset, onClick: () -> Unit = {}, modifier: Modifier = Modifier) {
    Image(
        asset = imageAsset,
        modifier = Modifier.size(35.dp).clip(CircleShape)
            .clickable(onClick = onClick) then modifier,
        contentScale = ContentScale.Crop
    )
}
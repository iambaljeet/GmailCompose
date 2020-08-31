package com.app.gmailcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageAsset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CircularImage(imageAsset: ImageAsset, onClick: () -> Unit = {}, modifier: Modifier = Modifier) {
    Image(
        asset = imageAsset,
        modifier = modifier.clip(CircleShape).clickable(onClick = onClick),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun SingleLineText(text: String, fontSize: TextUnit = 10.sp, fontWeight: FontWeight = FontWeight.Normal) {
    Text(text = text,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        style = TextStyle(
            fontSize = fontSize,
            fontWeight = fontWeight
        )
    )
}
package com.app.gmailcompose.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageAsset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gmailcompose.ui.getIconColor

@Composable
fun CircularImage(imageAsset: ImageAsset, onClick: () -> Unit = {}, modifier: Modifier = Modifier) {
    Image(
        asset = imageAsset,
        modifier = modifier.clip(CircleShape).clickable(onClick = onClick),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun SingleLineText(modifier: Modifier = Modifier, text: String, fontSize: TextUnit = 10.sp, fontWeight: FontWeight = FontWeight.Normal) {
    Text(
        text = text,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        style = TextStyle(
            fontSize = fontSize,
            fontWeight = fontWeight
        ),
        modifier = modifier
    )
}

@Composable
fun SeparatorSpacer(modifier: Modifier = Modifier.height(10.dp)) {
    Spacer(modifier = modifier)
}

@Composable
fun SeparatorDivider(modifier: Modifier = Modifier.fillMaxWidth(), thickness: Dp = 1.dp) {
    SeparatorSpacer()
    Divider(
        modifier = modifier,
        thickness = thickness,
    )
    SeparatorSpacer()
}

@Composable
fun DrawerMenuOptionItem(modifier: Modifier = Modifier.fillMaxWidth(), icon: VectorAsset?, listLabel: String?) {
    if (icon != null) {
        ListItem(
            modifier = modifier,
            icon = { Image(asset = icon, colorFilter = ColorFilter.tint(getIconColor())) },
            text = { listLabel?.let { Text(text = it) } },
        )
    } else {
        ListItem(
            modifier = modifier,
            text = { listLabel?.let { Text(text = it) } },
        )
    }
}

@Composable
fun BorderButton(modifier: Modifier = Modifier, icon: VectorAsset? = null, label: String, onClick: () -> Unit) {
    Row(
            verticalGravity = Alignment.CenterVertically,
            modifier = modifier.border(
                    width = 0.5.dp,
                    color = getIconColor(),
                    shape = RectangleShape
            ).clickable(
                    onClick = onClick
            ).padding(
                    padding = InnerPadding(
                            all = 12.dp
                    )
            ),
    ) {
        if (icon != null) {
            Icon(asset = icon,
                    modifier = Modifier.size(18.dp))
            SeparatorSpacer(
                    modifier = Modifier.width(4.dp)
            )
        }
        Text(text = label)
    }
}
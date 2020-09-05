package com.app.gmailcompose.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.ColumnScope.gravity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun MailDetailTopBar() {
    Row(
            modifier = Modifier.fillMaxWidth()
                        .height(48.dp)
                        .padding(
                                start = 10.dp,
                                end = 10.dp,
                                top = 10.dp,
                                bottom = 10.dp),
                verticalGravity = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
                asset = Icons.Outlined.ArrowBack,
                modifier = Modifier.gravity(
                        align = Alignment.Start
                )
                        .size(28.dp)
        )
        Row(
                modifier = Modifier
                        .gravity(
                                align = Alignment.End
                        )
        ) {
            Icon(
                    asset = Icons.Outlined.Search,
                    modifier = Modifier.padding(
                            end = 5.dp
                    )
                            .size(28.dp)
                            .clickable(onClick = {})
            )
            Icon(
                    asset = Icons.Outlined.Delete,
                    modifier = Modifier.padding(
                            end = 5.dp
                    )
                            .size(28.dp)
                            .clickable(onClick = {})
            )
            Icon(
                    asset = Icons.Outlined.MailOutline,
                    modifier = Modifier.padding(
                            end = 5.dp
                    )
                            .size(28.dp)
                            .clickable(onClick = {})
            )
            Icon(
                    asset = Icons.Outlined.MoreVert,
                    modifier = Modifier.padding(
                            end = 5.dp
                    )
                            .size(28.dp)
                            .clickable(onClick = {})
            )
        }
    }
}

@Preview
@Composable
fun previewToolbar() {
    MailDetailTopBar()
}
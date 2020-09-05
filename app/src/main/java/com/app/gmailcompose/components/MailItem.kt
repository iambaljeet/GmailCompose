package com.app.gmailcompose.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gmailcompose.model.MailData

@Composable
fun MailItem(mailData: MailData,
             modifier: Modifier = Modifier,
             onMailItemClicked: (mailData: MailData) -> Unit) {
    Row(
            modifier = modifier.padding(
                    start = 15.dp, end = 15.dp, top = 10.dp
            )
                    .clickable(onClick = { onMailItemClicked(mailData) }),
            verticalGravity = Alignment.CenterVertically
    ) {
        CircularImage(
            imageAsset = imageResource(id = mailData.userImage),
            modifier = Modifier.padding(end = 10.dp).size(42.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            SingleLineText(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            SingleLineText(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            SingleLineText(
                text = mailData.mailText,
                fontSize = 14.sp
            )
        }
        IconButton(
            onClick = {},
            modifier = Modifier.size(30.dp),
            icon = { Icon(asset = Icons.Outlined.Star) }
        )
    }
}
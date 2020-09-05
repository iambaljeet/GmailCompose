package com.app.gmailcompose.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.app.gmailcompose.model.MailData
import com.app.gmailcompose.state.MailDetailsUiState

@Composable
fun MailDetails(mailDetailsUiState: MailDetailsUiState) {
    Surface {
        Stack(modifier = Modifier.fillMaxSize()
                .padding(
                        all = 10.dp
                )
        ) {
            Column(Modifier.fillMaxSize()) {
                Row(
                        verticalGravity = Alignment.CenterVertically,
                        modifier = Modifier.padding(
                                bottom = 20.dp
                        )
                ) {
                    Text(
                            text = mailDetailsUiState.mailData.subject,
                            modifier = Modifier.weight(1f),
                            fontSize = 28.sp,
                    )
                    Icon(
                            asset = Icons.Outlined.Star,
                            modifier = Modifier.size(18.dp)
                    )
                }
                UserDetail(
                        mailData = mailDetailsUiState.mailData,
                        modifier = Modifier.padding(
                                bottom = 20.dp
                        ),
                        onMailItemClicked = {}
                )
                Text(
                        text = mailDetailsUiState.mailData.mailText,
                        modifier = Modifier
                                .weight(1f),
                        fontSize = 14.sp
                )
                HorizontalButtons(
                        modifier = Modifier
                                .fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun HorizontalButtons(modifier: Modifier = Modifier) {
    Row(
            modifier = modifier
                    .padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 15.dp,
                            bottom = 15.dp
                    ),
            horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BorderButton(
                icon = Icons.Outlined.ArrowBack,
                label = "Reply",
                onClick = {}
        )
        BorderButton(
                icon = Icons.Outlined.Send,
                label = "Reply All",
                onClick = {}
        )
        BorderButton(
                icon = Icons.Outlined.ArrowForward,
                label = "Forward",
                onClick = {}
        )
    }
}

@Composable
fun UserDetail(mailData: MailData,
               modifier: Modifier = Modifier,
               onMailItemClicked: (mailData: MailData) -> Unit) {
    Row(
            modifier = modifier
                    .fillMaxWidth()
                    .clickable(onClick = { onMailItemClicked(mailData) }),
            verticalGravity = Alignment.CenterVertically,
    ) {
        CircularImage(
                imageAsset = imageResource(id = mailData.userImage),
                modifier = Modifier.padding(end = 10.dp).size(42.dp)
        )
        Column(
                modifier = Modifier.weight(1f)
        ) {
            Row(
                    verticalGravity = Alignment.CenterVertically
            ) {
                SingleLineText(
                        text = mailData.userMail,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                )
                SeparatorSpacer(
                        modifier = Modifier.width(8.dp)
                )
                SingleLineText(
                        text = mailData.timeStamp,
                        fontSize = 12.sp
                )
            }
            SingleLineText(
                    text = "to me",
                    fontSize = 12.sp
            )
        }
        IconButton(
                onClick = {},
                modifier = Modifier.size(30.dp),
                icon = { Icon(asset = Icons.Outlined.KeyboardArrowLeft) }
        )
        IconButton(
                onClick = {},
                modifier = Modifier.size(30.dp),
                icon = { Icon(asset = Icons.Outlined.MoreVert) }
        )
    }
}

@Preview
@Composable
fun PreviewButtons() {
    HorizontalButtons()
}
package com.app.gmailcompose.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.InnerPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.app.gmailcompose.model.MailData
import com.app.gmailcompose.state.HomeUiState

@Composable
fun MailList(
    uiState: HomeUiState,
    scrollState: ScrollState,
    onMailItemClicked: (mailData: MailData) -> Unit
) {
    ScrollableColumn(
        contentPadding = InnerPadding(
            bottom = 20.dp
        ),
        scrollState = scrollState
    ) {
        uiState.mails.forEach { mails ->
            MailItem(
                    mailData = mails,
                    onMailItemClicked = onMailItemClicked
            )
        }
    }
}
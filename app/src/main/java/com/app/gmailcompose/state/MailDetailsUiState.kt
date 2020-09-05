package com.app.gmailcompose.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.app.gmailcompose.model.MailData

class MailDetailsUiState(
        mailData: MailData
) {
    private val _mailData: MutableState<MailData> =
            mutableStateOf(mailData)
    val mailData: MailData = _mailData.value
}
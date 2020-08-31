package com.app.gmailcompose.state

import androidx.compose.runtime.mutableStateListOf
import com.app.gmailcompose.model.MailData

class HomeUiState(
    allMails: List<MailData>
) {
    private val _mails: MutableList<MailData> =
        mutableStateListOf(*allMails.toTypedArray())
    val mails: List<MailData> = _mails
}
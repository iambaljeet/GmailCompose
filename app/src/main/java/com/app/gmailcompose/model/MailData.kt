package com.app.gmailcompose.model

import androidx.compose.runtime.Immutable

@Immutable
data class MailData(
    val mailId: Long,
    val userImage: Int,
    val userName: String,
    val userMail: String,
    val subject: String,
    val mailText: String,
    val timeStamp: String
)
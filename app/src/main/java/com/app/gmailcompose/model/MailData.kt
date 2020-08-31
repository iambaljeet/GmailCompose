package com.app.gmailcompose.model

data class MailData(
    val mailId: Long,
    val userImage: Int,
    val userName: String,
    val subject: String,
    val mailText: String,
    val timeStamp: String
)
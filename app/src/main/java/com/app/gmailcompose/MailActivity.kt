package com.app.gmailcompose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import com.app.gmailcompose.components.MailDetailTopBar
import com.app.gmailcompose.components.MailDetails
import com.app.gmailcompose.data.mailDetailsUiState
import com.app.gmailcompose.ui.GmailComposeTheme

class MailActivity: AppCompatActivity() {
    private var mailId: Long? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mailId = intent.extras?.getLong("mailId")
        setContent {
            GmailComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                            modifier = Modifier.padding(top = 30.dp),
                            topBar = {
                                MailDetailTopBar()
                            },
                            bodyContent = {
                                MailDetails(
                                        mailDetailsUiState = mailDetailsUiState(mailId = mailId)
                                )
                            },
                    )
                }
            }
        }
    }

    companion object {
        fun launch(context: Context?, mailId: Long) {
            val intent = Intent(context, MailActivity::class.java).apply {
                putExtra("mailId", mailId)
            }
            context?.startActivity(intent)
        }
    }
}
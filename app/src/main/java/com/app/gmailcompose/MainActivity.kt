package com.app.gmailcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import com.app.gmailcompose.components.ExpandableFab
import com.app.gmailcompose.components.HomeTopBar
import com.app.gmailcompose.components.MailList
import com.app.gmailcompose.components.NavDrawer
import com.app.gmailcompose.data.drawerUiState
import com.app.gmailcompose.data.homeUiState
import com.app.gmailcompose.ui.GmailComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val scrollState = rememberScrollState()
                    Scaffold(
                        modifier = Modifier.padding(top = 30.dp),
                        floatingActionButton = {
                            ExpandableFab(scrollState)
                        },
                        topBar = {
                            HomeTopBar()
                        },
                        bodyContent = {
                            MailList(
                                uiState = homeUiState,
                                scrollState = scrollState,
                                    onMailItemClicked = { mailData ->
                                        MailActivity.launch(this, mailData.mailId)
                                    }
                            )
                        },
                        drawerContent = {
                            NavDrawer(
                                uiState = drawerUiState
                            )
                        }
                    )
                }
            }
        }
    }
}
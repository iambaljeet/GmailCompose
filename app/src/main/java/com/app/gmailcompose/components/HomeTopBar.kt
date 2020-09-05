package com.app.gmailcompose.components

import androidx.compose.foundation.Box
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.app.gmailcompose.R

@Composable
fun HomeTopBar() {
    Surface(color = MaterialTheme.colors.surface) {
        Box(modifier = Modifier.padding(10.dp)) {
            Card(
                modifier = Modifier.preferredHeight(50.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = 5.dp
            ) {
                Row(
                    verticalGravity = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize().padding(end = 30.dp)
                ) {
                    IconButton(onClick = {}) {
                        Icon(asset = Icons.Default.Menu)
                    }
                    Text(
                        text = "Search in emails",
                        modifier = Modifier.fillMaxWidth()
                    )
                    CircularImage(
                        imageAsset = imageResource(id = R.drawable.yetanotherdev_),
                        modifier = Modifier.size(35.dp).clip(CircleShape),
                    )
                }
            }
        }
    }
}
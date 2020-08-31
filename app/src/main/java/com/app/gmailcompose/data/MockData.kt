package com.app.gmailcompose.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.app.gmailcompose.R
import com.app.gmailcompose.model.DrawerData
import com.app.gmailcompose.model.MailData
import com.app.gmailcompose.ui.creamColor
import com.app.gmailcompose.ui.lightBlueColor


object MockData {
    val mailList = listOf {
        MailData(
            mailId = 1,
            userImage = R.drawable.image_1,
            userName = "Charlie",
            subject = "This is regarding our recent conversation",
            mailText = "Hey there this mail is regarding our recent conversation over other platforms",
            timeStamp = "11:08 am"
        )
        MailData(
            mailId = 2,
            userImage = R.drawable.image_2,
            userName = "Sam",
            subject = "Email regarding job opportunity",
            mailText = "This is regarding a job opportunity for the profile or android developer in our organisation.",
            timeStamp = "10:00 am"
        )
        MailData(
            mailId = 3,
            userImage = R.drawable.image_3,
            userName = "Dexter",
            subject = "Regarding github collaboration",
            mailText = "This mail is regarding github collaboration for the new demos. Reply to this email if interested " +
                    "in collaborating for future projects",
            timeStamp = "08:05 am"
        )
        MailData(
            mailId = 4,
            userImage = R.drawable.image_4,
            userName = "Lelly",
            subject = "Instagram promotion trial",
            mailText = "Hey, out platform is offering free trial for some of the lucky users. " +
                    "In this trial you will get an opportunity to use our products for free (For a limited time)." +
                    "Hurry! before the offer closes.",
            timeStamp = "07:45 am"
        )
        MailData(
            mailId = 5,
            userImage = R.drawable.image_5,
            userName = "Stephen",
            subject = "Newsletter: issue #125",
            mailText = "#jetpack Alpha release. #Android 11 new beta out and more",
            timeStamp = "06:25 am"
        )
        MailData(
            mailId = 6,
            userImage = R.drawable.image_6,
            userName = "Sam",
            subject = "This is regarding our recent conversation",
            mailText = "Hey there this mail is regarding our recent conversation over other platforms",
            timeStamp = "06:00 am"
        )
        MailData(
            mailId = 7,
            userImage = R.drawable.image_7,
            userName = "Shirley",
            subject = "Weekly issue #25",
            mailText = "Weekly Issue #25: With the release of jetpack compose many new doors are opening in terms of creating UI " +
                    "more easily and fast.",
            timeStamp = "05:30 am"
        )
        MailData(
            mailId = 8,
            userImage = R.drawable.image_8,
            userName = "Slevester",
            subject = "This is regarding promotion on Instagram",
            mailText = "Hi,, our new channels are open for trial. If you want to know more about our plans you can follow " +
                    "up directly with me over this email thread.",
            timeStamp = "05:00 am"
        )
        MailData(
            mailId = 9,
            userImage = R.drawable.image_9,
            userName = "Cristy",
            subject = "Jetpack release alpha #MonthlyIssue 201",
            mailText = "Jetpack alpha version is now released. With the release of this library declarative UI's are now " +
                    "something is Android. Create UI's easily and fast with Jetpack compose.",
            timeStamp = "04:25 am"
        )
        MailData(
            mailId = 10,
            userImage = R.drawable.image_10,
            userName = "Henry",
            subject = "New message on Linkedin",
            mailText = "Hi, you have a new message on linkedin.",
            timeStamp = "02:00 am"
        )
    }

    val drawerOptionsList = listOf(
        DrawerData(
            icon = Icons.Outlined.MailOutline,
            title = "All inboxes"
        ),
        DrawerData(
            isDivider = true
        ),
        DrawerData(
            icon = Icons.Outlined.Person,
            title = "Social",
            count = 5,
            labelColor = creamColor
        ),
        DrawerData(
            icon = Icons.Outlined.Info,
            title = "Promotions",
            count = 25,
            labelColor = lightBlueColor
        ),
        DrawerData(
            isDivider = true
        ),
        DrawerData(
            icon = Icons.Outlined.Star,
            title = "Starred"
        ),
        DrawerData(
            icon = Icons.Outlined.Info,
            title = "Drafts"
        ),
        DrawerData(
            icon = Icons.Outlined.Send,
            title = "Sent"
        ),
        DrawerData(
            icon = Icons.Outlined.Delete,
            title = "Bin"
        )
    )
}
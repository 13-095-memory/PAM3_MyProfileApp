package com.memory.pam3_myprofileapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import org.jetbrains.compose.resources.painterResource
import pam3_myprofileapp.composeapp.generated.resources.Res
import pam3_myprofileapp.composeapp.generated.resources.memory
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.draw.clip


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        ProfileHeader(
            name = "Memory Simanjuntak",
            bio = "Teknik Informatika"
        )

        Spacer(modifier = Modifier.height(20.dp))

        ProfileInfoCard()

        // Spacer ini mendorong tombol ke bawah layar
        Spacer(modifier = Modifier.height(400.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("Log Out")
        }
    }
}

@Composable
fun ProfileHeader(
    name: String,
    bio: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(Res.drawable.memory),
            contentDescription = "Profile Photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = name,
            style = MaterialTheme.typography.headlineSmall
        )

        Text(
            text = bio,
            color = Color.Gray
        )
    }
}

@Composable
fun ProfileInfoCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            InfoItem("Email", "memorysimanjuntak@gmail.com")
            InfoItem("Phone", "082277586825")
            InfoItem("Location", "Lampung")
        }
    }
}

@Composable
fun InfoItem(
    label: String,
    value: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),

        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(label)

        Text(value)
    }
}
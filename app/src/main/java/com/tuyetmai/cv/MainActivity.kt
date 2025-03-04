package com.tuyetmai.cv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CVScreen()
                }
            }
        }
    }
}

@Composable
fun CVScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileSection()
        Spacer(modifier = Modifier.height(16.dp))
        ExperienceSection()
    }
}

@Composable
fun ProfileSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "Profile Picture",
            modifier = Modifier.size(120.dp).padding(8.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = "Duong Ly Tuyet Mai", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Fourth-year student at UIT, VNU-HCM", fontSize = 16.sp, color = MaterialTheme.colorScheme.primary)
    }
}

@Composable
fun ExperienceSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Education", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "UIT, VNU-HCM - Information System (2019 - 2024)")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Work Experience", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "Facebook - Fresher Web Developer (2021 - Present)")
        Text(text = "Developing dating functions similar to Tinder on Facebook page.")
    }
}
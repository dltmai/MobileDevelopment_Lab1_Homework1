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

// Entry point of the application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Apply MaterialTheme to the app
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CVScreen() // Call the CV screen
                }
            }
        }
    }
}

// Main UI component displaying the CV content
@Composable
fun CVScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars) // Add padding to avoid system bars
            .padding(16.dp), // Set margins
        horizontalAlignment = Alignment.Start
    ) {
        ProfileSection()  // Profile information
        Spacer(modifier = Modifier.height(16.dp)) // Space between sections
        ExperienceSection() // Education and work experience
        Spacer(modifier = Modifier.height(16.dp))
        SkillsSection() // Skills section
        Spacer(modifier = Modifier.height(16.dp))
        ProjectsSection() // Projects section
    }
}

// Component displaying profile information
@Composable
fun ProfileSection() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.image), // Profile picture
            contentDescription = "Profile Picture",
            modifier = Modifier.size(120.dp).padding(8.dp), // Set size and padding
            contentScale = ContentScale.Crop // Crop image to fit
        )
        Spacer(modifier = Modifier.width(16.dp)) // Space between image and text
        Column {
            Text(text = "Duong Ly Tuyet Mai", fontSize = 24.sp, fontWeight = FontWeight.Bold) // Name
            Spacer(modifier = Modifier.height(8.dp))
            ContactSection() // Display contact details
        }
    }
}

// Component displaying education and work experience
@Composable
fun ExperienceSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Education", fontSize = 20.sp, fontWeight = FontWeight.Bold) // Education title
        Text(text = "Fourth-year student of UIT, VNU-HCM - Information System (2019 - 2024)") // Education details
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Work Experience", fontSize = 20.sp, fontWeight = FontWeight.Bold) // Work experience title
        Text(text = "Facebook - Fresher Web Developer (2021 - Present)") // Job details
        Text(text = "Developing dating functions similar to Tinder on Facebook page.") // Job description
    }
}

// Component displaying skills
@Composable
fun SkillsSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Skills", fontSize = 20.sp, fontWeight = FontWeight.Bold) // Skills title
        Text(text = "- Programming: Kotlin, JavaScript, Solidity")
        Text(text = "- Web Development: React.js, Remix, Web3.js")
        Text(text = "- Blockchain: Ethereum, Smart Contracts, Solidity")
        Text(text = "- Databases: MySQL, MSSQL, Firebase")
        Text(text = "- DevOps: Docker, Nginx, AWS EC2")
    }
}

// Component displaying projects
@Composable
fun ProjectsSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Projects", fontSize = 20.sp, fontWeight = FontWeight.Bold) // Projects title
        Text(text = "- Voting System on Ethereum Blockchain") // Project 1
        Text(text = "  A decentralized voting system using Solidity and Web3.js.")
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "- E-commerce Website with React and Node.js") // Project 2
        Text(text = "  A full-stack e-commerce platform with authentication and payment integration.")
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "- Cryptography Application") // Project 3
        Text(text = "  Implemented Playfair, Vigenère, and RSA ciphers for secure communication.")
    }
}

// Component displaying contact details
@Composable
fun ContactSection() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.Start) {
        Text(text = "Email: tuyetmai@example.com") // Email
        Text(text = "GitHub: github.com/dltmai") // GitHub
        Text(text = "LinkedIn: linkedin.com/in/tuyetmai") // LinkedIn
    }
}

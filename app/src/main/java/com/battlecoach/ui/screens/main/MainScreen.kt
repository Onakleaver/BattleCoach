package com.battlecoach.ui.screens.main

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Battle Coach",
            style = MaterialTheme.typography.headlineLarge
        )
        
        Spacer(modifier = Modifier.height(32.dp))
        
        Button(onClick = { /* TODO */ }) {
            Text("Start Training")
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = { /* TODO */ }) {
            Text("Play vs AI")
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Text(
            text = "Version 1.0.0",
            style = MaterialTheme.typography.bodyMedium
        )
    }
} 
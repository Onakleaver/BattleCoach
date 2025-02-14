package com.battlecoach.ui.components

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.window.Dialog
import com.battlecoach.data.repository.GameImportRepository

@Composable
fun ImportGameDialog(
    onDismiss: () -> Unit,
    onImport: (String) -> Unit,
    repository: GameImportRepository,
    username: String
) {
    var text by remember { mutableStateOf("") }
    var isUrl by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val filePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let {
            // Handle the selected file
            val file = File(context.contentResolver.getFilePath(uri))
            repository.uploadApk(file, username)
        }
    }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = MaterialTheme.shapes.medium
        ) {
            Column {
                Text("Import Game")
                
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text(if (isUrl) "URL" else "PGN") }
                )

                Switch(
                    checked = isUrl,
                    onCheckedChange = { isUrl = it }
                )

                Button(
                    onClick = { onImport(text) }
                ) {
                    Text("Import PGN")
                }
                
                Button(
                    onClick = { filePickerLauncher.launch("application/vnd.android.package-archive") }
                ) {
                    Text("Upload APK")
                }
            }
        }
    }
}

package com.example.cursobasicoandroid.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextExample(name: String) {
    Text(name, fontSize = 40.sp, color = Color.Black, fontWeight = FontWeight.ExtraBold)
}

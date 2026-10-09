package com.example.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursobasicoandroid.R

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen(){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().clickable{}) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF3FD5EC))
                .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                modifier = Modifier.size(75.dp),
                painter = painterResource(R.drawable.ic_happy_face),
                contentDescription = null
            )
            Column(modifier = Modifier) {
                Text("Aristidevs", color = Color.White)
                Text("Mobile Developer", color = Color.White)
            }
            Button(onClick = {}) {
                Text("Follow")
            }
        }
    }
}
package com.nigdroid.jetpackcompose.jetpackCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ModifiersExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(30.dp)
                .background(Color.Blue, shape = RoundedCornerShape(5.dp)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Apple",fontSize = 20.sp)
            Text(text = "Banana",fontSize = 20.sp)
            Text(text = "Grapes",fontSize = 20.sp)
        }
        Row(
            modifier = Modifier
                .background(Color.Red, shape = RoundedCornerShape(5.dp))
                .size(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Center",fontSize = 20.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(30.dp)
                .background(Color.Green, shape = RoundedCornerShape(5.dp)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "One",fontSize = 20.sp)
            Text(text = "Two",fontSize = 20.sp)
            Text(text = "Three",fontSize = 20.sp)

        }
    }
}
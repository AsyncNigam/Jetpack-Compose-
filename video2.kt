package com.nigdroid.jetpackcompose.jetpackCompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)

@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
        Text(text = "grapes", fontSize = 30.sp)
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
        Text(text = "grapes", fontSize = 30.sp)
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnExample02() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login Here", fontSize = 30.sp)

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Enter Your Name") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Enter Your Email") }
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Boxlayout() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Apple",
            fontSize = 30.sp,
            modifier=Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "banana",
            fontSize = 30.sp,
            modifier=Modifier.align(Alignment.TopEnd)
        )
        Text(
            text = "Grapes",
            fontSize = 30.sp,
            modifier=Modifier.align(Alignment.CenterStart)
        )

    }
}
package com.nigdroid.jetpackcompose.jetpackCompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExample() {
    Text(
        text = "Hello Nigam Prasad Sahoo",
        color = Color.Magenta,
        fontSize = 30.sp,
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 2.sp,
        maxLines = 2,

        )
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
private fun TextFieldExample() {

    var name = remember { mutableStateOf("") }

    TextField(
        value = name.value,
        onValueChange = { name.value = it },
//        label = { Text(text = "Enter Your Name") }
        placeholder = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,

                )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan,

                )
        },
        singleLine = true,
//        shape= RoundedCornerShape(size=15.dp),
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.Yellow,
            focusedContainerColor = Color.Blue,
            focusedIndicatorColor = Color.Blue,
        )

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {

    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
//        label = { Text(text = "Enter Your Name") }
        placeholder = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,

                )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan,

                )
        },
        singleLine = true,
//        shape= RoundedCornerShape(size=15.dp),
        shape = CircleShape,
        colors = OutlinedTextFieldDefaults.colors( )
    )

}
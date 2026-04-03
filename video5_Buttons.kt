package com.nigdroid.jetpackcompose.jetpackCompose

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun ButtonExample() {
    val context = LocalContext.current
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center,
       modifier = Modifier.fillMaxSize()
   ){
       Button(
           onClick = { Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show() } ,
           modifier = Modifier.fillMaxWidth(0.5f),
           colors = ButtonDefaults.buttonColors(
               containerColor = Color.Cyan ,
               contentColor = Color.DarkGray
           ),
           shape= RoundedCornerShape(8.dp),
           elevation = ButtonDefaults.buttonElevation(
               defaultElevation = 10.dp
           ),
           border = BorderStroke(2.dp, Color.Black)
       ) {
          Row(
              modifier=Modifier.fillMaxWidth(),
              horizontalArrangement = Arrangement.Center ,
              verticalAlignment = Alignment.CenterVertically
          ){
              Icon(
                  imageVector = Icons.Default.KeyboardArrowRight,
                  contentDescription = "Icon",
              )

              Text(
                  text = "Click Me",
                  fontWeight = FontWeight.Bold
              )
          }
       }
   }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login Here",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(48.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* Handle Login */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 4.dp
            ),
            enabled = username.isNotBlank() && email.isNotBlank()
        ) {
            Text(
                text = "LOGIN",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OutlineButtonExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(
            onClick = { /* Handle click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Gray),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Click Me!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}


@Preview(showBackground = true,showSystemUi = true)
@Composable
private fun TextButtonExample() {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        TextButton(
            onClick = { Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show() } ,
            modifier = Modifier.fillMaxWidth(0.5f),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Cyan ,
                contentColor = Color.DarkGray
            ),
            shape= RoundedCornerShape(8.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp
            ),
        ) {
            Row(
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center ,
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Icon",
                )

                Text(
                    text = "Click Me",
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
private fun IconButtonExample() {
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        IconButton(onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()

        }){
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Go to home",
                tint = Color.Black,
                modifier = Modifier.size(50.dp)
            )
        }
    }


}
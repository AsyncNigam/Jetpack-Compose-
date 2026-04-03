package com.nigdroid.jetpackcompose.jetpackCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import com.nigdroid.jetpackcompose.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageExample() {
    Image(
        painter = painterResource(id = R.drawable.image),
        contentDescription = "Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun IconExample() {
    Icon(
        imageVector = Icons.Default.Person,
        contentDescription = "Icon",
    )
}
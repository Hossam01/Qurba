package com.reader.qurba.ui.componant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun  CustomPostFooter(name:String,type:String,img:Int) {
    Column(modifier = Modifier.padding(5.dp)) {
        Row (verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = img), contentDescription = null, modifier = Modifier
                .clip(CircleShape)
                .padding(2.dp))
            Column {
                Text(text = name, fontSize = 13.sp, fontStyle = FontStyle.Normal, modifier = Modifier.padding(start = 3.dp))
                Text(text = type, fontSize = 10.sp, modifier = Modifier.padding(start = 3.dp, end = 2.dp), fontWeight = FontWeight.ExtraLight)
            }
        }
    }
}
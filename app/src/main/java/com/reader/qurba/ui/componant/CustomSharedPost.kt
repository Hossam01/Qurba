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
import com.reader.qurba.R

@Composable
fun CustomSharedPostHeader(name:String,to:String,time:String){
    Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.p1), contentDescription = null, modifier = Modifier
                .clip(CircleShape)
                .padding(2.dp))
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = name, fontSize = 15.sp, fontStyle = FontStyle.Normal, modifier = Modifier.padding(start = 1.dp))
                    Image(painter = painterResource(id = R.drawable.too), contentDescription = null)
                    Text(text = to, fontSize = 14.sp, fontStyle = FontStyle.Normal, modifier = Modifier.padding(start = 1.dp))
                }
                Row {
                    Text(text = time, fontSize = 10.sp, modifier = Modifier.padding(start = 1.dp , end = 2.dp), fontWeight = FontWeight.Light)
                }
            }
        }
        Row(horizontalArrangement = Arrangement.End , verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.dots), contentDescription = null, modifier = Modifier.padding(top = 15.dp, end = 10.dp).size(width = 20.dp, height = 5.dp))
        }
    }
}
package com.reader.qurba.ui.componant

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reader.qurba.R
import com.reader.qurba.util.Social


@Composable
fun CustomButtons(likeNum:String,comNum:String,shareNum:String,onClick :(Social) ->Unit) {
    Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(start = 5.dp, end = 5.dp, top = 6.dp))
    Row(modifier = Modifier.fillMaxWidth().padding(top = 3.dp, bottom = 3.dp).clickable { onClick(Social.LIKE) }, horizontalArrangement = Arrangement.Center , verticalAlignment = Alignment.CenterVertically) {
        Row(modifier = Modifier.weight(1f),horizontalArrangement = Arrangement.Center) {
            Text(text = likeNum , modifier = Modifier.padding(3.dp) , fontSize = 10.sp)
            Image(painter = painterResource(id = R.drawable.like2), contentDescription = null , modifier = Modifier
                .size(20.dp)
                .padding(3.dp) )
        }
        Row(modifier = Modifier.weight(1f).clickable { onClick(Social.COMMENT) },horizontalArrangement = Arrangement.Center) {
            Text(text = comNum , modifier = Modifier.padding(3.dp) , fontSize = 10.sp)
            Image(painter = painterResource(id = R.drawable.comment), contentDescription = null , modifier = Modifier
                .size(20.dp)
                .padding(3.dp) )
        }
        Row(modifier = Modifier.weight(1f).clickable { onClick(Social.SHARE) }, horizontalArrangement = Arrangement.Center) {
            Text(text = shareNum , modifier = Modifier.padding(3.dp) , fontSize = 10.sp)
            Image(painter = painterResource(id = R.drawable.share), contentDescription = null , modifier = Modifier
                .size(20.dp)
                .padding(3.dp) )
        }
    }
    Divider(color = Color.Gray, thickness = 1.dp,modifier = Modifier.padding(start = 5.dp, end = 5.dp, bottom = 5.dp))
}
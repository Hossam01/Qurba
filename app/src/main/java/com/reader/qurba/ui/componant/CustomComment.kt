package com.reader.qurba.ui.componant

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reader.qurba.R
import com.reader.qurba.ui.theme.color3

@Composable
fun CustomComment(commenterImage:Int,commenterName:String,commenterComment:String,likesNum:String?,time:String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 5.dp, bottom = 10.dp, start = 5.dp)) {
        Image(painter = painterResource(id = commenterImage), contentDescription = null, modifier = Modifier
            .clip(CircleShape)
            .padding(2.dp).size(40.dp))
        Column(modifier = Modifier.padding(top = 2.dp)) {
            Column(modifier = Modifier
                .background(color = color3, shape = RoundedCornerShape(13.dp) )
                .padding(2.dp).width(130.dp).height(46.dp)) {
                Row(modifier = Modifier.padding(start = 6.dp)) {
                    Text(text = commenterName, fontSize = 12.sp, fontStyle = FontStyle.Normal, modifier = Modifier.padding(start = 3.dp), fontWeight = FontWeight.Bold)
                }
                Row(modifier = Modifier.padding(start = 6.dp)) {
                    Text(text = commenterComment, fontSize = 12.sp, modifier = Modifier.padding(start = 3.dp, top = 3.dp), fontWeight = FontWeight.ExtraLight)
                }
            }
            Row(modifier = Modifier.padding(top = 2.dp)) {
                Text(text = time, fontSize = 12.sp, modifier = Modifier.padding(start = 10.dp))
                Text(text = stringResource(id = R.string.Like), fontSize = 12.sp, modifier = Modifier.padding(start = 10.dp))
                Text(text = stringResource(id = R.string.Replay), fontSize = 12.sp, modifier = Modifier.padding(start = 10.dp))
                if (likesNum != null){
                    Row {
                        Text(text = likesNum, fontSize = 12.sp, modifier = Modifier.padding(start = 10.dp))
                        Image(painter = painterResource(id = R.drawable.like1), contentDescription = null , modifier = Modifier.size(16.dp).padding(start = 4.dp) )
                    }
                }
            }
        }
    }
}
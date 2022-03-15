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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reader.qurba.R
import com.reader.qurba.model.PostData
import com.reader.qurba.util.Statics



@Composable
fun CustomPostHeader(icon: String?, name: String, type: String?, time: String, img: Int, sharedFrom: PostData?) {
    val currentIcons:Int = if (icon == "p"){
        R.drawable.v
    }else{
        R.drawable.r
    }

    Row (modifier = Modifier.fillMaxWidth().padding(start = 5.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = img), contentDescription = null, modifier = Modifier.clip(CircleShape).padding(2.dp))
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = name, fontSize = 15.sp, fontStyle = FontStyle.Normal, modifier = Modifier.padding(start = 3.dp))
                    Image(painter = painterResource(id = currentIcons), contentDescription = null, modifier = Modifier
                        .clip(CircleShape)
                        .padding(start = 2.dp))
                }
                Row {
                    if (type != null) { Text(text = type, fontSize = 10.sp, modifier = Modifier.padding(start = 3.dp, end = 2.dp), fontWeight = FontWeight.ExtraLight)
                        Text(text = stringResource(id = R.string.DOT), fontSize = 10.sp, fontWeight = FontWeight.ExtraLight)}
                    Text(text = time, fontSize = 10.sp, modifier = Modifier.padding(start = 3.dp , end = 2.dp), fontWeight = FontWeight.Light)
                }
            }
        }
        Row(horizontalArrangement = Arrangement.End , verticalAlignment = Alignment.CenterVertically) {
            if (sharedFrom == null) {
                Image(painter = painterResource(id = R.drawable.dots), contentDescription = null, modifier = Modifier.padding(top = 15.dp, end = 10.dp).size(width = 20.dp, height = 5.dp))
            }
        }
    }
}
package com.reader.qurba.ui.componant

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reader.qurba.R



@Composable
fun CustomSharePost(){
    var text  by remember { mutableStateOf("") }
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White), verticalAlignment = Alignment.CenterVertically) {
        Image(modifier = Modifier
            .size(60.dp)
            .clip(CircleShape)
            .padding(10.dp), painter = painterResource(id = R.drawable.share_pic) , contentDescription = stringResource(id = R.string.icon_top_bar)  )
        Card(elevation = 7.dp ,modifier = Modifier.height(45.dp).fillMaxWidth(fraction = 0.9f),  shape = RoundedCornerShape(20.dp), ) {
            TextField(value = text  , onValueChange = {text = it } , modifier = Modifier.height(30.dp),
                placeholder = { Text(text = stringResource(id = R.string.POST), fontSize = 11.sp )  } ,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Gray,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent )  )
        }

    }
}

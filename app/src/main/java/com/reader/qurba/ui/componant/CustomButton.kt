package com.reader.qurba.ui.componant

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reader.qurba.ui.theme.Purple200
import com.reader.qurba.R
import com.reader.qurba.ui.theme.*

@Composable
fun CustomButton(onClick:(B:Int?) -> Unit) {
    val buttonColor = listOf(color1, color2)
    Button( modifier = Modifier.height(35.dp).fillMaxWidth().padding(start = 15.dp, end = 15.dp, bottom = 5.dp), shape = RoundedCornerShape(80.dp)
        ,colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),contentPadding = PaddingValues(),onClick = {onClick(null)})
    {
        Box( modifier = Modifier
            .background(Brush.horizontalGradient(buttonColor), alpha = 0.4f)
            .fillMaxSize()
            ,contentAlignment = Alignment.Center ){
            Text(text = stringResource(id = R.string.Button_TEXT), color =  Purple200, fontSize = 13.sp , fontWeight = FontWeight.Bold)
        }
    }
}
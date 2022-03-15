package com.reader.qurba.ui.componant

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun  CustomDescription(text:String) {
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 6.dp, bottom = 5.dp)) {
        Text(text = text, fontSize = 12.sp, modifier = Modifier.padding(start = 3.dp), textAlign = TextAlign.Start) }
}
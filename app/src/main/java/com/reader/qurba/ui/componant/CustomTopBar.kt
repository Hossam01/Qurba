package com.reader.qurba.ui.componant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.reader.qurba.R


@Composable
fun CustomTopBar(){
    TopAppBar(
        elevation = 7.dp,
        modifier = Modifier.fillMaxWidth(),
        title = { Image( painter = painterResource(R.drawable.logo) , contentDescription = stringResource(id = R.string.icon_top_bar) , modifier = Modifier.size(58.dp,14.dp) ) },
        actions = {
            IconButton(onClick = { /*Clickable*/ }) {
                Image(painter = painterResource(R.drawable.bell), contentDescription = stringResource(id = R.string.icon_top_bar) , modifier = Modifier.size(18.dp)  )
            }
            IconButton(onClick = { /*Clickable*/ }) {
                Image(painter = painterResource(R.drawable.search), contentDescription = stringResource(id = R.string.icon_top_bar) , modifier = Modifier.size(18.dp) )
            }
            IconButton(onClick = { /*Clickable*/ }) {
                Image(painter = painterResource(R.drawable.shop_m), contentDescription = stringResource(id = R.string.icon_top_bar) , modifier = Modifier.size(18.dp) )
            }
        },
        backgroundColor = Color.White)
}

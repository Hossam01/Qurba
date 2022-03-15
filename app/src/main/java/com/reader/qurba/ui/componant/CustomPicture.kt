package com.reader.qurba.ui.componant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.reader.qurba.R
import com.google.accompanist.flowlayout.FlowRow


@Composable
fun CustomPicture(images:List<Int>?){
    if (images != null) {
        if (images.size == 1){
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = images[0]), contentDescription = null ,modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp) , contentScale = ContentScale.FillWidth)
            }
        }else{
            FlowRow() {
                repeat(images.size ) {
                    if (images.size == it){
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(painter = painterResource(id = images[it]), contentDescription = null ,modifier = Modifier.padding(3.dp).fillMaxHeight().fillMaxWidth() , contentScale = ContentScale.Crop)
                        }
                    }else {
                        Box(modifier = Modifier.fillMaxWidth(fraction = 0.5f)) {
                            Image(
                                painter = painterResource(id = images[it]),
                                contentDescription = null,
                                modifier = Modifier.padding(3.dp).fillMaxHeight().fillMaxWidth(),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CustomPictureDesignDisplay(){
    CustomPicture(listOf(R.drawable.ing,R.drawable.img,R.drawable.img1))
}
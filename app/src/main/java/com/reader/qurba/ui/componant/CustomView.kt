package com.reader.qurba.ui.componant

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.reader.qurba.model.Post
import com.reader.qurba.util.Social


@Composable
fun CustomView(posts: Post,menuButton:(Post,Social)->Unit){
    Card(elevation = 9.dp) {
        Column {
            if (posts.sharedFrom == null){
                CustomPostHeader(posts.post.verified,posts.post.publisherName,posts.post.publisherType,posts.post.time,posts.post.publisherImg,posts.sharedFrom)}else{
                CustomSharedPostHeader(name = posts.post.publisherName , to =posts.post.sharedTo!! , time = posts.post.time )
            }
            CustomDescription(posts.post.postDescription)
            if (posts.post.restaurantData != null) {
                CustomPicture(posts.post.postImages)
                CustomPostFooter(posts.post.restaurantData.name, posts.post.restaurantData.description, posts.post.restaurantData.img)
            }else{
                Card(elevation = 2.dp, modifier = Modifier.padding(7.dp)) {
                    Column {
                        CustomPostHeader(posts.sharedFrom!!.verified, posts.sharedFrom.publisherName, posts.sharedFrom.publisherType, posts.sharedFrom.time, posts.sharedFrom.publisherImg,posts.sharedFrom)
                        CustomDescription(posts.sharedFrom.postDescription)
                        CustomPicture(posts.sharedFrom.postImages)
                        CustomPostFooter(posts.sharedFrom.restaurantData!!.name, posts.sharedFrom.restaurantData.description, posts.sharedFrom.restaurantData.img)
                    }
                }
            }
            posts.post.restaurantData?.let { if (it.navigationButton){ CustomButton{menuButton(posts,Social.MENU) } } }
            CustomButtons(posts.socialInteracts.like, comNum = posts.socialInteracts.comments, shareNum = posts.socialInteracts.Share){ menuButton(posts,it)}
            if (posts.commentDetails != null){ CustomComment(posts.commentDetails.commenterImg,posts.commentDetails.commenterName,posts.commentDetails.comment,posts.commentDetails.likes,posts.commentDetails.time)}
        }
    }
}
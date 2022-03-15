package com.reader.qurba.model

data class AllPosts(val data:List<Post>)

data class Post(val post:PostData,val socialInteracts:SocialInteracts,val sharedFrom:PostData?,val commentDetails:CommentDetails?)

class PostData(val publisherName:String, val publisherImg:Int,val publisherType:String? ,val postDescription:String, val postImages:List<Int>?, val verified:String?, val time:String, val restaurantData:RestaurantData?,val sharedTo:String?=null)

class RestaurantData(val name:String,val img:Int,val description:String,val navigationButton:Boolean)

class SocialInteracts(val like:String,val comments:String,val Share:String)

class CommentDetails (val commenterName:String,val commenterImg:Int,val comment:String,val likes: String?,val time: String)
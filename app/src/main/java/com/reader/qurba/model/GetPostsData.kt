package com.reader.qurba.model

import com.reader.qurba.R

class GetPostsData {

    fun getData(): AllPosts {
        return AllPosts( listOf(Post(
            PostData("Chicken Chester",
                R.drawable.c, null ,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
                listOf(R.drawable.img2),"r","3 days ago" , RestaurantData("Chicken Chester",R.drawable.f1,"Cafe & Restaurant",true) ), SocialInteracts("32k","597","12.3k") ,null,CommentDetails("Jaxson Schleifer",R.drawable.p2,"Lorem ipsum ","2","1h")  ),

            Post( PostData("Rayna Rosser",
                R.drawable.p1, "Verified Buyer" ,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
                listOf(R.drawable.ing,R.drawable.img,R.drawable.img1),"p","2 days ago" ,RestaurantData("Chicken MACDO, Carmel Sandae, Fri.. ",R.drawable.m,"Mcdonald's",false)), SocialInteracts("32k","597","12.3k") ,null,null  ),


            Post( PostData("Skylarani Arcand",
                R.drawable.p3, null,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
                null,null,"1 sec ago" ,null,"Chicken Chester"), SocialInteracts("32k","597","12.3k") ,PostData("Rayna Rhiel Madsen",
                R.drawable.p4, null,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet.....",
                listOf(R.drawable.img2),"p","2 days ago",RestaurantData("Buy 2 Chicken Burger Combo and 2..",R.drawable.c,"Chicken Chester",false)),null  ),
        ))
    }
}
package com.reader.qurba.util

import android.content.res.Resources

enum class Social{LIKE,COMMENT,SHARE,MENU}
class Statics {
    companion object{
        lateinit var resources: Resources
        fun setResource(resources: Resources){
            this.resources = resources
        }
    }
}
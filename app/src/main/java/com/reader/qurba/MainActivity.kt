package com.reader.qurba

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.reader.qurba.ui.theme.QurbaTheme
import androidx.compose.ui.Modifier
import com.reader.qurba.navigation.SetupNavGraph
import com.reader.qurba.util.Statics


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QurbaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    SetupNavGraph(navController = navController)

                }
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QurbaTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            SetupNavGraph(navController = navController)
        }    }
}


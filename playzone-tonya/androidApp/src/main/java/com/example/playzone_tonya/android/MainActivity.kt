package com.example.playzone_tonya.android

import GamesRepository
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import di.Inject.instance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gamesRepository = instance<GamesRepository>()
        CoroutineScope(context = Dispatchers.IO).launch {
            val games = gamesRepository.fetchAllGames()
            withContext(Dispatchers.Main) {
                val tv = findViewById<TextView>(androidx.core.R.id.text2)
                tv.text = "Title: ${games.first().title}"
            }
        }
    }
}

//@Composable
//fun GreetingView(text: String) {
//    Text(text = text)
//}

//@Preview
//@Composable
//fun DefaultPreview() {
//    MyApplicationTheme {
//        GreetingView(TestClass().hello())
//    }
//}

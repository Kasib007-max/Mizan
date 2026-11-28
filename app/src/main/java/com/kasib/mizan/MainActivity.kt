package com.kasib.mizan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kasib.mizan.ui.theme.MIZANTheme
import com.kasib.mizan.nav.MizanNavGraph

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            MIZANTheme {
                MizanNavGraph()
            }
        }
    }
}
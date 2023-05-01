package com.example.hiltdemonewapp

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.hiltdemonewapp.features.ui.screens.NoteScreen
import com.example.hiltdemonewapp.ui.theme.HiltDemoNewAppTheme

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
            window.statusBarColor = android.graphics.Color.TRANSPARENT

            HiltDemoNewAppTheme {
                NoteScreen()
            }
        }
    }
}

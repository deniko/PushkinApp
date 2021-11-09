package com.example.pushkinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.pushkinapp.R
import kotlin.random.Random

private const val TAG = "MyLog"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG,"Ты видел деву на скале")
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "В одежде белой над волнами")
        Log.i(TAG, "Когда, бушуя в бурной мгле,")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "Играло море с берегами,")
        Log.i(TAG, "Когда луч молний озарял")
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "Ее всечасно блеском алым")
        Log.i(TAG, "И ветер бился и летал")
    }

    override fun onStop() {
        super.onStop()

        Log.i(TAG, "С ее летучим покрывалом?")
        Log.i(TAG, "Прекрасно море в бурной мгле")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG, "И небо в блесках без лазури;")
        Log.i(TAG, "Но верь мне: дева на скале")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "Прекрасней волн, небес и бури.")
    }
}
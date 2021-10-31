package com.example.pushkinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.pushkinapp.R
import kotlin.random.Random

private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"

class MainActivity : AppCompatActivity() {

    private lateinit var pushkinButton: Button
    private lateinit var pushkinLines: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pushkinLines = findViewById(R.id.my_text)
        pushkinButton = findViewById(R.id.my_button)

        if(savedInstanceState != null)
            pushkinLines.text = savedInstanceState.getString(VALUE)


        pushkinButton.setOnClickListener { pushkin() }
        Log.d(MY_OWN_LOG_TAG, "OnCreate()")
    }

    private fun pushkin(){
        val verse: List<String> = listOf("Ты видел деву на скале", "В одежде белой над волнами", "Когда, бушуя в бурной мгле,", "Играло море с берегами,", "Когда луч молний озарял", "Ее всечасно блеском алым", "И ветер бился и летал", "С ее летучим покрывалом?", "Прекрасно море в бурной мгле", "И небо в блесках без лазури;", "Но верь мне: дева на скале", "Прекрасней волн, небес и бури.")
        for(i in verse){
            println(i).toString().also { pushkinLines.text = it }
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d(MY_OWN_LOG_TAG, "OnStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.d(MY_OWN_LOG_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()

        Log.d(MY_OWN_LOG_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()

        Log.d(MY_OWN_LOG_TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(MY_OWN_LOG_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(MY_OWN_LOG_TAG, "onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUE, pushkinLines.text.toString())
    }
}
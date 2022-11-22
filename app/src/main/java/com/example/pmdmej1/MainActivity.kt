package com.example.pmdmej1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onRestart = 0
    private var onStop = 0
    private var onDestroy = 0
    private var nombreCompleto = "init"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombreCompleto = savedInstanceState?.getString("nombreCompleto").toString()
        onCreate++
        println("onCreate $onCreate")
        println("nombre $nombreCompleto")

        val nombre : EditText = findViewById(R.id.editNombre)
        val apellido : EditText = findViewById(R.id.editApellido)
        val aceptar : Button = findViewById(R.id.button)

        aceptar.setOnClickListener(){
            nombreCompleto = "${nombre.text} ${apellido.text}"
            println("nombre $nombreCompleto")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nombreCompleto",nombreCompleto)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        nombreCompleto = savedInstanceState.getString("nombreCompleto").toString()
    }

    override fun onStart() {
        super.onStart()

        onStart++
        println("onStart $onCreate")

    }

    override fun onResume() {
        super.onResume()
        onResume++
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        onPause++
        println("onPause $onPause")
    }

    override fun onRestart() {
        super.onRestart()
        onRestart++
        println("onRestart $onRestart")
    }

    override fun onStop() {
        super.onStop()
        onStop++
        println("onStop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        onDestroy++
        println("onDestroy $onDestroy")
    }
}
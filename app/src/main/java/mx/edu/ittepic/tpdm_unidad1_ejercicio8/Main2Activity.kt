package mx.edu.ittepic.tpdm_unidad1_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    var posicion : EditText ?= null
    var mostrar : Button ?= null
    var resulpos : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        posicion = findViewById(R.id.posicion)
        mostrar = findViewById(R.id.mostrar)
        resulpos = findViewById(R.id.resulpos)
        var cadena = intent.extras?.getString("num")
        var pos = resulpos?.text.toString()
        resulpos?.setText("Posición: $pos: ")
    }
}

package mx.edu.ittepic.tpdm_unidad1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var valores : EditText ?= null
    var abriractivity : Button ?= null
    var num = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        valores = findViewById(R.id.valores)
        abriractivity = findViewById(R.id.abriractivity)
        abriractivity?. setOnClickListener(){
            val abrir = Intent(this,Main2Activity::class.java)
            num = valores?.text.toString()
            abrir.putExtra("num",num)
            startActivity(abrir)
        }
    }
}

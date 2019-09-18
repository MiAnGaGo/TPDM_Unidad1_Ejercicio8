package mx.edu.ittepic.tpdm_unidad1_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Main2Activity : AppCompatActivity() {
    var mostrar: Button? = null
    var posicion: EditText? = null
    var p = 0
    var layout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mostrar = findViewById(R.id.mostrar)
        posicion = findViewById(R.id.posicion)
        p = posicion?.text.toString().toInt()
        layout = findViewById(R.id.layoutpos)

        mostrar?.setOnClickListener {
            var cadena = intent.extras?.getString("num")
            var array = arrayOf(cadena?.split(","))
            if (p < 0 || p > array.size) AlertDialog.Builder(this).setTitle("Array Vacio")
                .setMessage("Error!")
                .setPositiveButton("Aceptar") { dialog, wich -> }
                .show()
            var posicion = TextView(this)
            posicion?.setText("Posicion $p: $array[p]")
            layout?.addView(posicion)
        }
    }
}
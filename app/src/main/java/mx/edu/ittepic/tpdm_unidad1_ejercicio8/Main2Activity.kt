package mx.edu.ittepic.tpdm_unidad1_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Main2Activity : AppCompatActivity() {
    var posicion: EditText?=null
    var btnPos : Button?=null
    var layout: LinearLayout?=null
    var pos=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        posicion= findViewById(R.id.posicion)
        btnPos= findViewById(R.id.posBtn)
        layout=findViewById(R.id.poslayo)

        btnPos?.setOnClickListener {
            layout?.removeAllViews()
            var cadena = intent.extras?.getString("num")
            pos= posicion?.text.toString().toInt()
            var vector= cadena?.split(",")

            if(pos>vector!!.size || pos<0){
                AlertDialog.Builder(this).setTitle("Error")
                .setMessage("Posicion no encontrada")
                .setPositiveButton("Aceptar"){dialog,which->}
                .show()}
            var textR = TextView(this)
            textR.setText("Posicion: "+pos+".valor: "+vector[pos])
            layout?.addView(textR)


        }

    }
}
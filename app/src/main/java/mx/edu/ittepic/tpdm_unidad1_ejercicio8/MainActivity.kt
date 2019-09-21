package mx.edu.ittepic.tpdm_unidad1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    var nv : EditText?=null
    var abrir: Button?=null
    var num=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nv=findViewById(R.id.numvector)
        abrir=findViewById(R.id.abrir)

        abrir?.setOnClickListener {

            num=nv?.text.toString()
            var activity2= Intent(this,Main2Activity::class.java)
            activity2.putExtra("num",num)
            startActivity(activity2)

        }
    }
}
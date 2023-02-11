package com.example.beratbadanideal_nurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var tb : EditText
    private lateinit var jkLakilaki : RadioButton
    private lateinit var jkperempuan : RadioButton
    private lateinit var hasil : TextView
    private lateinit var hitung : Button
    private var tbadan : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.txtNama)
        tb = findViewById(R.id.txtTibad)
        jkLakilaki = findViewById(R.id.rbLk)
        jkperempuan = findViewById(R.id.rbPr)
        hasil= findViewById(R.id.txthsl)
        hitung = findViewById(R.id.btnproses)

        hitung.setOnClickListener {
            var tinggi = tb.text.toString().toInt()
            var nama = nama.text.toString()

            if(jkLakilaki.isChecked){
                tbadan = (tinggi-100)-((tinggi-100)* 10/100)
                hasil.setText("Nama : $nama Berat Badan Ideal : " + tbadan.toString()+ "kg")
            } else if (jkperempuan.isChecked){
                tbadan = (tinggi-100)-((tinggi-100)* 15/100)
                hasil.setText("Nama : $nama Berat Badan Ideal : " +tbadan.toString()+ "kg")
            }else{
                hasil.setText("Pilih jenis kelamin terlebih dahulu")
            }
        }

    }

}
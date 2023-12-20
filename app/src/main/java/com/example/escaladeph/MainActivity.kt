package com.example.escaladeph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.escaladeph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btConfirmar.setOnClickListener{
           val numero = binding.editNumero.text.toString()
           if (numero.isEmpty()){
               Toast.makeText(this,"Campo Vazio!", Toast.LENGTH_SHORT).show()
               binding.txtDescricao.text = ""
               binding.imgTubo.setBackgroundResource(0)
               binding.imgS.setBackgroundResource(0)
           }else{
               escalaPh(numero)
           }
        }
    }

    private fun escalaPh(numero: String){
       when(numero){
           "0" -> {
               binding.txtDescricao.text = "Ácido de bateria \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t1)
               binding.imgS.setBackgroundResource(R.drawable.s0)
           }
           "1" -> {
               binding.txtDescricao.text = "Ácido estomacal \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t1)
               binding.imgS.setBackgroundResource(R.drawable.s1)
           }
           "2" -> {
               binding.txtDescricao.text = "Limão \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t2)
               binding.imgS.setBackgroundResource(R.drawable.s2)
           }
           "3" -> {
               binding.txtDescricao.text = "Suco de Laranja \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t3)
               binding.imgS.setBackgroundResource(R.drawable.s3)
           }
           "4" -> {
               binding.txtDescricao.text = "Tomate \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t4)
               binding.imgS.setBackgroundResource(R.drawable.s4)
           }
           "5" -> {
               binding.txtDescricao.text = "Café  \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t5)
               binding.imgS.setBackgroundResource(R.drawable.s5)
           }
           "6" -> {
               binding.txtDescricao.text = "Urina \nSubstância ÁCIDA "
               binding.imgTubo.setBackgroundResource(R.drawable.t6)
               binding.imgS.setBackgroundResource(R.drawable.s6)
           }
           "7" -> {
               binding.txtDescricao.text = "Água \nNEUTRA "
               binding.imgTubo.setBackgroundResource(R.drawable.t7)
               binding.imgS.setBackgroundResource(R.drawable.s7)
           }
           "8" -> {
               binding.txtDescricao.text = "Água do mar \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t8)
               binding.imgS.setBackgroundResource(R.drawable.s8)
           }
           "9" -> {
               binding.txtDescricao.text = "Bicarbonato de Sódio \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t9)
               binding.imgS.setBackgroundResource(R.drawable.s9)
           }
           "10" -> {
               binding.txtDescricao.text = "Pastilha antiácido estomacal \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t10)
               binding.imgS.setBackgroundResource(R.drawable.s10)
           }
           "11" -> {
               binding.txtDescricao.text = "Solução de amônia \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t11)
               binding.imgS.setBackgroundResource(R.drawable.s11)
           }
           "12" -> {
               binding.txtDescricao.text = "Água com sabão \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t12)
               binding.imgS.setBackgroundResource(R.drawable.s12)
           }
           "13" -> {
               binding.txtDescricao.text = "Água sanitária \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t13)
               binding.imgS.setBackgroundResource(R.drawable.s13)
           }
           "14" -> {
               binding.txtDescricao.text = "Limpador de ralo \nSubstância ALCALINA "
               binding.imgTubo.setBackgroundResource(R.drawable.t14)
               binding.imgS.setBackgroundResource(R.drawable.s14)
           }


       }
    }
}
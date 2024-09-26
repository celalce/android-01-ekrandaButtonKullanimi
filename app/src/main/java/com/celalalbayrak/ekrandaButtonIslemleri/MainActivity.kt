package com.celalalbayrak.ekrandaButtonIslemleri

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.celalalbayrak.ekrandaButtonIslemleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
             }
        binding.textView.text = "Merhaba Celal"


    }

// aşağıdaki fonksiyonlar activity_main.xml de app ekranındaki buttonlarına aittir.
    // kaydet buttonuna basılınca "Kayıt Edildi" yazısını ekrana basar.
    // iptal buttonuna basılınca "İptal Edildi" yazısını ekrana basar.

    fun kaydet(view : View) {
        binding.textView.text = "Kayıt Edildi!"
    }

    fun iptal(view : View) {
        binding.textView.text = "İptal Edildi!"

    }

}
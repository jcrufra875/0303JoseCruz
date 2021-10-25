package com.josecruz.a0303josecruz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josecruz.a0303josecruz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgAmsterdam.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("geo:52.36727469873469, 4.902207594879863"))
            )
        }
        binding.imgCanalDeBrujas.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("geo:51.27675530490236, 3.2122007944071194"))
            )
        }
        binding.imgCerdena.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.264079962210495, 9.618819432807614"))
            )
        }
        binding.imgNoteDame.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.853105978238034, 2.3498703946813495"))
            )
        }
    }
}
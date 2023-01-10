package eniso.gte2.examenihebkhalfallah

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import eniso.gte2.examenihebkhalfallah.databinding.ActivityContactBinding
import eniso.gte2.examenihebkhalfallah.databinding.ActivityMainBinding

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_contact)
        val binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val res = intent.getStringExtra("op")
        if (res=="Appel"){
            binding.e1.visibility=View.VISIBLE
            binding.button2.visibility=View.VISIBLE
        }
        else{
            binding.e1.visibility=View.VISIBLE
            binding.e2.visibility=View.VISIBLE
            binding.button.visibility=View.VISIBLE
        }
        binding.button2.setOnClickListener{
            val uri = Uri.parse("tel:${binding.e1.text}")
            val i = Intent(Intent.ACTION_DIAL,uri)
            startActivity(i)

        }
        binding.button.setOnClickListener{
            val uri = Uri.parse("smsto:${binding.e1.text}?body=${binding.e2.text}")
            val i = Intent(Intent.ACTION_SENDTO,uri)
            startActivity(i)
        }
    }
}
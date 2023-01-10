package eniso.gte2.examenihebkhalfallah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import eniso.gte2.examenihebkhalfallah.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            if (binding.radioButton0.isChecked==binding.radioButton1.isChecked){
                Toast.makeText(this,"Vous devez Cochez l'opération à réaliser",LENGTH_LONG).show()
            }
            else{
                val i =Intent(this,ContactActivity::class.java)
                if (binding.radioButton0.isChecked)
                    i.putExtra("op","Appel")
                else
                    i.putExtra("op","SMS")
                startActivity(i)
            }
        }
    }
}
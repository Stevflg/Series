package com.example.series

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.series.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    var series:ArrayList<Series> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<*>
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        series.add(
            Series("Juego de Tronos",
                "2011–2019",
                "https://i.pinimg.com/originals/af/12/c5/af12c570796478f28454c33b0d36a1a6.jpg",
                "Nueve familias nobles luchan por el control de las tierras de Poniente, mientras que un antiguo enemigo regresa después de estar inactivo durante milenios.")
        )
        series.add(
            Series("Breaking Bad",
                "2008-2013",
                "https://img.sfilm.hu/w300/Ahr25VAM7egQRBABjxLzEHd5bgP.jpg",
                "Un profesor de instituto diagnosticado con cáncer de pulmón empieza a manufacturar y vender metamfetamina para asegurar el futuro de su familia.")
        )
        series.add(
            Series("The last of Us",
                "2023",
                "https://pelismaraton.nu/poster/the_last_of_us-temporada-1.jpg",
                "Joel y Ellie, una pareja conectada a través de la dureza del mundo en el que viven, se ven obligados a soportar circunstancias brutales y asesinos despiadados en un viaje por la América posterior a una pandemia.")
        )
        series.add(
            Series("Cyberpunk: Edgerunners",
                "2022",
                "https://image.tmdb.org/t/p/original/lqcDVZ8pyk08AVftMBildDR3QUK.jpg",
                "En una realidad distópica repleta de corrupción e implantes cibernéticos, un joven talentoso e impulsivo intenta convertirse en un mercenario.")
        )
        series.add(
            Series("Cyberpunk: Edgerunners",
                "2022",
                "https://image.tmdb.org/t/p/original/lqcDVZ8pyk08AVftMBildDR3QUK.jpg",
                "En una realidad distópica repleta de corrupción e implantes cibernéticos, un joven talentoso e impulsivo intenta convertirse en un mercenario.")
        )



        var adapter= MyAdapter(this,series)

        binding.ListaSeries.adapter=adapter

        binding.ListaSeries.setOnItemClickListener { parent, view, position, id ->
            val intent= Intent(MainActivity@this,SeriesDataActivity::class.java ).apply{
            putExtra("TITLE",series[id.toInt()].title)
            putExtra("DESCRIPCION", series[id.toInt()].description)
            putExtra("PICTURE", series[id.toInt()].imageurl)
            putExtra("YEAR",series[id.toInt()].year)
            }
            startActivity(intent)
        }


    }
}
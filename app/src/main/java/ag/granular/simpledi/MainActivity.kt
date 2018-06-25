package ag.granular.simpledi

import ag.granular.simpledi.coffee.CoffeeMaker
import ag.granular.simpledi.coffee.ElectricHeater
import ag.granular.simpledi.coffee.Thermosiphon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heater = ElectricHeater()
        val pump = Thermosiphon(heater)

        CoffeeMaker(heater, pump).brew()
    }
}

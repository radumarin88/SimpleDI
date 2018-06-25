package ag.granular.simpledi.coffee

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

open class ElectricHeater @Inject constructor(val context: Context): Heater {
    private var heating = false

    override fun on() {
        Toast.makeText(context, "~ ~ ~ heating ~ ~ ~", Toast.LENGTH_SHORT).show()
        heating = true
    }

    override fun off() {
        heating = false;
    }

    override fun isHot() = heating
}
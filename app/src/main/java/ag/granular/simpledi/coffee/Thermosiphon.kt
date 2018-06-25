package ag.granular.simpledi.coffee

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

open class Thermosiphon @Inject constructor(val heater: Heater, val context: Context) : Pump {
    override fun pump() {
        if (heater.isHot()) {
            Toast.makeText(context, "=> => pumping => =>", Toast.LENGTH_SHORT).show()
        }
    }
}
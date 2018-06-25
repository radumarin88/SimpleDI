package ag.granular.simpledi.coffee

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class CoffeeMaker @Inject constructor(val heater: Heater, val pump: Pump, val context: Context) {
    fun brew() {
        heater.on()
        pump.pump()
        Toast.makeText(context, " [_]P coffee! [_]P ", Toast.LENGTH_SHORT).show()
    }
}
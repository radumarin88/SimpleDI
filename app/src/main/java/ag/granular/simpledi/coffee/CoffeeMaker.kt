package ag.granular.simpledi.coffee

import javax.inject.Inject

class CoffeeMaker @Inject constructor(val heater: Heater, val pump: Pump) {
    fun brew() {
        heater.on()
        pump.pump()
        System.out.println(" [_]P coffee! [_]P ")
    }
}
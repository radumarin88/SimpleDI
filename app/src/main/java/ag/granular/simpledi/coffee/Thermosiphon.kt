package ag.granular.simpledi.coffee

import javax.inject.Inject

open class Thermosiphon @Inject constructor(val heater: Heater) : Pump {
    override fun pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>")
        }
    }
}
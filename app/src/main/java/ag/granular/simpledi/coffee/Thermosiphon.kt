package ag.granular.simpledi.coffee

open class Thermosiphon(val heater: ElectricHeater) : Pump {
    override fun pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>")
        }
    }
}
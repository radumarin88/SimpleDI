package ag.granular.simpledi.coffee

open class Thermosiphon(val heater: ElectricHeater) {
    fun pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>")
        }
    }
}
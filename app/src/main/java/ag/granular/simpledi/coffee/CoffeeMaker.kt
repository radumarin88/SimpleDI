package ag.granular.simpledi.coffee

class CoffeeMaker {
    private val heater: ElectricHeater

    private val pump: Thermosiphon

    init {
        heater = ElectricHeater()
        pump = Thermosiphon(heater)
    }

    fun brew() {
        heater.on()
        pump.pump()
        System.out.println(" [_]P coffee! [_]P ")
    }
}
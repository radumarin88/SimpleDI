package ag.granular.simpledi.coffee

class CoffeeMaker(val heater: Heater, val pump: Pump) {
    fun brew() {
        heater.on()
        pump.pump()
        System.out.println(" [_]P coffee! [_]P ")
    }
}
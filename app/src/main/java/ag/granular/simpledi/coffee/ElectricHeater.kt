package ag.granular.simpledi.coffee

open class ElectricHeater: Heater {
    private var heating = false

    override fun on() {
        System.out.println("~ ~ ~ heating ~ ~ ~")
        heating = true
    }

    override fun off() {
        heating = false;
    }

    override fun isHot() = heating
}
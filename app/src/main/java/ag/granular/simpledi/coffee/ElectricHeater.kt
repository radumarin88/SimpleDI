package ag.granular.simpledi.coffee

open class ElectricHeater {
    private var heating = false

    fun on() {
        System.out.println("~ ~ ~ heating ~ ~ ~")
        heating = true
    }

    fun off() {
        heating = false;
    }

    open fun isHot() = heating
}
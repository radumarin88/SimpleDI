package ag.granular.simpledi

import ag.granular.simpledi.coffee.ElectricHeater
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class HeaterTest {
    @Test
    fun testHeaterOnAndOff() {
        val heater = ElectricHeater()
        assertThat(heater.isHot(), `is`(false))

        heater.on()
        assertThat(heater.isHot(), `is`(true))

        heater.off()
        assertThat(heater.isHot(), `is`(false))
    }
}
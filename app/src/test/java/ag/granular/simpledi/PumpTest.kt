package ag.granular.simpledi

import ag.granular.simpledi.coffee.ElectricHeater
import ag.granular.simpledi.coffee.Thermosiphon
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PumpTest {
    @Test
    fun testPumpUsesHeater() {
        val heater = mock(ElectricHeater::class.java)
        val pump = Thermosiphon(heater)

        `when`(heater.isHot()).thenReturn(false)

        pump.pump()
        verify(heater, atLeastOnce()).isHot()
    }
}
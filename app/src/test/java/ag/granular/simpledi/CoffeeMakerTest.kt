package ag.granular.simpledi

import ag.granular.simpledi.coffee.CoffeeMaker
import ag.granular.simpledi.coffee.Heater
import ag.granular.simpledi.coffee.Pump
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CoffeeMakerTest {
    @Test
    fun testCoffeeMaker() {
        val heater = mock(Heater::class.java)
        val pump = mock(Pump::class.java)
        val coffeeMaker = CoffeeMaker(heater, pump)

        coffeeMaker.brew()
        verify(heater, atLeastOnce()).on()
        verify(pump, atLeastOnce()).pump()
    }
}
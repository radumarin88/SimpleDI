package ag.granular.simpledi.coffee.di.components

import ag.granular.simpledi.coffee.CoffeeMaker
import ag.granular.simpledi.coffee.di.modules.DripCoffeeModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DripCoffeeModule::class])
interface CoffeeAppComponent {
    fun maker(): CoffeeMaker
}
package ag.granular.simpledi.coffee.di.modules

import ag.granular.simpledi.coffee.ElectricHeater
import ag.granular.simpledi.coffee.Heater
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [PumpModule::class])
class DripCoffeeModule {
    @Provides
    @Singleton
    fun provideHeater(context: Context): Heater = ElectricHeater(context)
}
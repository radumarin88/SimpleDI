package ag.granular.simpledi.coffee.di.modules

import ag.granular.simpledi.coffee.Pump
import ag.granular.simpledi.coffee.Thermosiphon
import dagger.Binds
import dagger.Module

@Module
abstract class PumpModule {
    @Binds
    abstract fun providePump(pump: Thermosiphon): Pump
}
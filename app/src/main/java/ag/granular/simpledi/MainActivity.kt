package ag.granular.simpledi

import ag.granular.simpledi.coffee.di.components.DaggerCoffeeAppComponent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCoffeeAppComponent.builder()
                .context(this)
                .build()
                .maker()
                .brew()
    }
}

package club.arson.impulse.inject.modules

import com.google.inject.AbstractModule

class ConfigManagerModule(private val reloadOnInit: Boolean) : AbstractModule() {
    override fun configure() {
        bind(Boolean::class.java).toInstance(reloadOnInit)
    }
}
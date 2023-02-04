import org.kodein.di.DI
import ktor.ktorModule
import json.serializationModule

val coreModule = DI.Module("coreModule") {
    importAll(
        serializationModule,
        ktorModule
    )
}
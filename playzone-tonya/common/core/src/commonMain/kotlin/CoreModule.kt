import org.kodein.di.DI
import ktor.ktorModule

val coreModule = DI.Module("coreModule") {
    importAll(
        ktorModule
    )
}
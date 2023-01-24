pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "playzone-tonya"
include(":androidApp")
include(":shared")
include(":common:auth:api")
include(":common:auth:data")
include(":common:auth:presentation")
include(":common:tournaments:api")
include(":common:tournaments:data")
include(":common:tournaments:presentation")
include(":common:games:api")
include(":common:games:data")
include(":common:games:presentation")
include(":common:core")

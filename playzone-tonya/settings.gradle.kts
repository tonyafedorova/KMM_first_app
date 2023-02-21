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
include(":common:auth:compose")
include(":common:tournaments:api")
include(":common:tournaments:data")
include(":common:tournaments:presentation")
include(":common:tournaments:compose")
include(":common:games:api")
include(":common:games:data")
include(":common:games:presentation")
include(":common:games:compose")
include(":common:core")
include(":common:core-compose")
include(":common:umbrella-ios")
include(":common:umbrella-compose")

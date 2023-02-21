plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:auth:presentation"))
                implementation(project(":common:core-compose"))
                implementation(Dependencies.Other.ViewModel.core)
            }
        }
    }
}
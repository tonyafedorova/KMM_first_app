plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))
                implementation(project(":common:core-compose"))
                implementation(project(":common:auth:data"))
                implementation(project(":common:auth:compose"))
                implementation(project(":common:games:data"))
                implementation(project(":common:tournaments:data"))

                implementation(Dependencies.Other.Navigation.compose)
                implementation(Dependencies.Other.Navigation.core)
            }
        }
    }
}
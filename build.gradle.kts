// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.kotlin.android) apply false
//    alias(libs.plugins.kotlin.compose) apply false
////    id("com.google.dagger.hilt.android") version "2.48.1" apply false
////    id ("com.google.devtools.ksp") version "2.0.21-1.0.25" apply false //1.9.0-1.0.12+
//
//    id ("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false
//    id("com.google.dagger.hilt.android") version "2.51.1" apply false
//
//}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
}

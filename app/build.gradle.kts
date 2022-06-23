plugins {
    id("com.example.app")
}

android {
    namespace = "com.example.convention"

    defaultConfig {
        applicationId = "com.example.convention"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":lib"))

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("androidx.compose.ui:ui:1.2.0-rc01")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.0-rc01")
    implementation("androidx.compose.material:material:1.2.0-rc01")

    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-rc01")
    debugImplementation("androidx.compose.ui:ui-tooling:1.2.0-rc01")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.2.0-rc01")
}
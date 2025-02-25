plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.googleDevtoolsKsp)
    alias(libs.plugins.googleServices)
}

android {
    signingConfigs {
        getByName("debug") {
            storeFile =
                file("D:\\kowlej\\high level language\\Kotlin\\Android_Studio\\MyKeyStore\\CrudKeyStore.jks")
            storePassword = "gufron2003"
            keyAlias = "crudkeystore"
            keyPassword = "gufron2003"
        }
    }
    namespace = "com.example.mycrud"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mycrud"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("debug")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.annotation)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Room
    implementation(libs.androidx.room)
    annotationProcessor(libs.androidx.roomCompiler)
    ksp(libs.androidx.roomCompiler)

    // Firebase
    implementation(libs.firebaseAnalytics)
    implementation(libs.firebaseAuth)
    implementation(platform(libs.firebaseBom))
    implementation(libs.playServicesAuth) // google login dependencies
}
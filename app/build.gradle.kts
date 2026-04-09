plugins { id("com.android.application") kotlin("android") }
android {
compileSdk = 33
defaultConfig {
applicationId = "com.example.derivminimal"
minSdk = 24
targetSdk = 33
versionCode = 1
versionName = "0.1"
}
compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
kotlinOptions { jvmTarget = "17" }
buildTypes { getByName("debug") { isMinifyEnabled = false } }
}

dependencies {
implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
implementation("com.squareup.okhttp3:okhttp:4.11.0")
implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
implementation("androidx.core:core-ktx:1.12.0")
implementation("androidx.appcompat:appcompat:1.6.1")
implementation("com.google.android.material:material:1.10.0")
}

# Kotlin Multiplatform Mobile Sample

This project pretends to be a research project to play around with Kotlin Multiplatform Mobile (KMM) and discover its benefits and drawbacks 


# Project structure

The KMM project structure is compound by three main blocks or folders.

## androidApp

The [androidApp](https://github.com/JaviSFH/KMM-sample/tree/master/androidApp) folder contains the Android application. It is a regular Android Project, built with Gradle, which you can play around with Android Studio IDE.

## iosApp

The [iosApp](https://github.com/JaviSFH/KMM-sample/tree/master/iosApp) folder contains the iOS application. It is a regular iOS app that can be opened and run with Xcode.

## shared

The [shared](https://github.com/JaviSFH/KMM-sample/tree/master/shared) folder contains the shared **Kotlin code** that will be consumed by the applications explained above. This is where the magic takes place and the core keys to be considered are the following.

### /commonMain

This folder hosts the actual common code, which is supposed to be totally independent from the platform and totally interchangeable. 

### /androidMain

This folder contains the code dependent from the Android Platform. It provides the actual implementation for the expected declaration in `commonMain`. For instance, it can be used to retrieve the device information, which implementation is different for each platform. The actual Android implementation would be `android.os.Build.VERSION.BASE_OS` to retrieve the Operating system version.

### /iOsMain

This folder contains the code dependent from the iOS Platform. It provides the actual implementation for the expected declaration in `commonMain`. For instance, it can be used to retrieve the device information, which implementation is different for each platform.  The actual iOS implementation would be `UIDevice.currentDevice.systemName()` to retrieve the Operating system version.

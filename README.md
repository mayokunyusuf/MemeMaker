# MemeMaker

A cross-platform meme generator for Android and iOS, built with Kotlin Multiplatform and Compose Multiplatform.

## Tech Stack

*   **Kotlin Multiplatform:** For sharing code between Android and iOS.
*   **Compose Multiplatform:** For building the UI for both platforms from a single codebase.
*   **Koin:** For dependency injection.
*   **Kotlinx Coroutines:** For managing background threads.

## Project Structure

*   `composeApp/src/commonMain`: Shared business logic and UI, written in Kotlin and Compose.
*   `composeApp/src/androidMain`: Android-specific implementations, including platform services like file exporting and sharing.
*   `composeApp/src/iosMain`: iOS-specific implementations for platform services.

## Features

*   **Meme Gallery:** Browse a list of meme templates.
*   **Meme Editor:**
    *   Add and edit text on meme templates.
    *   Move, scale, and rotate text elements.
*   **Export & Share:** Save created memes to the device and share them with other apps.

## Platform-Specific Implementation

### Android

*   Meme rendering is done using `android.graphics.Bitmap` and `android.graphics.Canvas`.
*   File sharing is implemented using a `FileProvider`.

### iOS

*   Meme rendering is done using `CoreGraphics` and `UIKit`.
*   File sharing is implemented using `UIActivityViewController`.
# MemeMaker

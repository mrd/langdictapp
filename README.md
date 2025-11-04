# LangDict - Spanish/English Dictionary App

A comprehensive Android dictionary app for quick Spanish/English word lookups with real-time API-powered translations and bidirectional search capability.

## Features

- **Real Dictionary API**: Powered by MyMemory Translation API for comprehensive, real-world translations
- **Bidirectional Search**: Search for words in either Spanish or English
- **Real-time Results**: See results as you type with smart debouncing
- **Multiple Translations**: Shows primary translation plus alternative high-quality matches
- **Loading States**: Visual feedback during API calls
- **Offline Fallback**: Falls back to built-in dictionary when offline
- **Smart Debouncing**: Waits 500ms after you stop typing to avoid excessive API calls
- **Clean Material Design UI**: Modern, intuitive interface

## Technical Details

- **Language**: Kotlin
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)
- **Architecture**: Repository pattern with API integration
- **Networking**:
  - Retrofit 2.9.0 for API calls
  - OkHttp 4.11.0 for HTTP client
  - Gson for JSON parsing
  - Kotlin Coroutines for async operations
- **UI Components**:
  - Material Design Components
  - RecyclerView for efficient list display
  - TextInputLayout for search interface
  - CardView for result presentation
  - ProgressBar for loading states

## Dictionary Source

**Primary**: [MyMemory Translation API](https://mymemory.translated.net/)
- Free, community-driven translation API
- No API key required
- Provides primary translation plus alternative matches
- Quality scoring for translation accuracy

**Fallback**: Built-in offline dictionary with 80+ common words covering:
- Common nouns (house, book, dog, cat, etc.)
- Essential verbs (eat, drink, go, come, etc.)
- Basic adjectives (big, small, good, bad, etc.)
- Everyday vocabulary

The fallback dictionary includes multiple translations to handle language ambiguity:
- "gato" → "cat" (animal) or "jack" (car tool)
- "tiempo" → "time" or "weather"
- "watch" → "ver" (to watch) or "reloj" (timepiece)

## Building the App

### Option 1: Using Android Studio
1. Open the project in Android Studio
2. Sync Gradle files
3. Run on an emulator or physical device

### Option 2: Command Line Build and Install

**Prerequisites:**
- Java JDK 11 or higher
- Android SDK installed (see installation instructions below)
- `ANDROID_HOME` or `ANDROID_SDK_ROOT` environment variable set
- `adb` in your PATH (from Android SDK platform-tools)
- Connected Android device or running emulator

**Installing Android SDK:**

If you don't have Android SDK installed:

1. **Using Android Studio** (easiest):
   - Download from https://developer.android.com/studio
   - SDK is installed automatically
   - Set `ANDROID_HOME` to SDK location (typically `~/Android/Sdk` on Linux/Mac)

2. **Using command-line tools only**:
   ```bash
   # Download command-line tools from:
   # https://developer.android.com/studio#command-line-tools-only

   # Extract and set up
   unzip commandlinetools-linux-*.zip
   mkdir -p ~/android-sdk/cmdline-tools/latest
   mv cmdline-tools/* ~/android-sdk/cmdline-tools/latest/

   # Set environment variable
   export ANDROID_HOME=~/android-sdk
   export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin
   export PATH=$PATH:$ANDROID_HOME/platform-tools

   # Install required packages
   sdkmanager "platform-tools" "platforms;android-34" "build-tools;34.0.0"
   ```

**Quick Build and Install:**
```bash
./build-and-install.sh
```

**Or step by step:**

1. **Build the APK:**
   ```bash
   ./build.sh
   ```
   This will create: `app/build/outputs/apk/debug/app-debug.apk`

2. **Install to device:**
   ```bash
   ./install.sh
   ```
   Or manually with adb:
   ```bash
   adb install -r app/build/outputs/apk/debug/app-debug.apk
   ```

**Using Gradle directly:**
```bash
# Build
gradle assembleDebug

# Or if Gradle wrapper is configured:
./gradlew assembleDebug

# Install
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

**Useful adb commands:**
```bash
# List connected devices
adb devices

# Uninstall the app
adb uninstall com.langdict

# View logs
adb logcat | grep LangDict
```

## Usage

**Requirements**: Internet connection for API-powered translations (works offline with limited built-in dictionary)

Simply type a word in Spanish or English into the search box:

1. **Type your query** - Start typing any Spanish or English word
2. **Wait for results** - After you stop typing for 500ms, the app queries the API
3. **View translations** - Results show:
   - The word and its source language
   - Primary translation
   - Alternative high-quality translations
   - Translation sources and quality scores

**Tips**:
- Press the search button on keyboard for immediate results (no 500ms wait)
- Works bidirectionally - try both English→Spanish and Spanish→English
- If offline, falls back to built-in dictionary with 80+ common words

## Future Enhancements

Possible improvements for future versions:
- ~~Offline dictionary API integration~~ ✓ Implemented with MyMemory API
- Add more dictionary APIs for richer results (WordReference, Linguee)
- Cache recent translations for faster repeat lookups
- Pronunciation audio
- Example sentences and usage context
- Favorites/History
- Verb conjugations
- Persistent database (Room/SQLite)
- Part of speech detection via NLP

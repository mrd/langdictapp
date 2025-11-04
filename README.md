# LangDict - Spanish/English Dictionary App

A simple Android dictionary app for quick Spanish/English word lookups with bidirectional search capability.

## Features

- **Bidirectional Search**: Search for words in either Spanish or English
- **Real-time Results**: See results as you type
- **Multiple Translations**: Shows all possible translations for ambiguous words
- **Parts of Speech**: Displays grammatical category (noun, verb, adjective, etc.)
- **Definitions**: Includes clear definitions for each translation
- **Clean Material Design UI**: Modern, intuitive interface

## Technical Details

- **Language**: Kotlin
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)
- **Architecture**: Simple repository pattern with in-memory data
- **UI Components**:
  - Material Design Components
  - RecyclerView for efficient list display
  - TextInputLayout for search interface
  - CardView for result presentation

## Dictionary Content

The app includes over 80 common words with multiple translations, covering:
- Common nouns (house, book, dog, cat, etc.)
- Essential verbs (eat, drink, go, come, etc.)
- Basic adjectives (big, small, good, bad, etc.)
- Everyday vocabulary

Many words include multiple translations to handle language ambiguity. For example:
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
- Android SDK installed
- `ANDROID_HOME` or `ANDROID_SDK_ROOT` environment variable set
- `adb` in your PATH (from Android SDK platform-tools)
- Connected Android device or running emulator

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

Simply type a word in Spanish or English into the search box. Results will appear automatically as you type, showing:
- The matching word
- Its language (Spanish/English)
- All possible translations
- Part of speech for each translation
- Definition for each meaning

## Future Enhancements

Possible improvements for future versions:
- Persistent database (Room/SQLite)
- Offline dictionary API integration
- Pronunciation audio
- Example sentences
- Favorites/History
- Extended vocabulary coverage

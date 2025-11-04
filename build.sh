#!/bin/bash
# Build script for LangDict Android app

set -e

echo "Building LangDict Android app..."
echo

# Check if Android SDK is available
if [ -z "$ANDROID_HOME" ] && [ -z "$ANDROID_SDK_ROOT" ]; then
    if [ -d "/opt/android-sdk" ]; then
        export ANDROID_HOME=/opt/android-sdk
        export ANDROID_SDK_ROOT=/opt/android-sdk
        echo "Using Android SDK at: $ANDROID_HOME"
    else
        echo "ERROR: Android SDK not found."
        echo "Please set ANDROID_HOME or ANDROID_SDK_ROOT environment variable."
        exit 1
    fi
fi

# Use gradlew if available, otherwise use system gradle
if [ -f "gradlew" ] && [ -f "gradle/wrapper/gradle-wrapper.jar" ]; then
    echo "Using Gradle wrapper..."
    BUILD_CMD="./gradlew"
else
    echo "Using system Gradle..."
    BUILD_CMD="gradle"
fi

# Build the app
echo "Building debug APK..."
$BUILD_CMD assembleDebug

echo
echo "Build complete!"
echo "APK location: app/build/outputs/apk/debug/app-debug.apk"

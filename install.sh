#!/bin/bash
# Install script for LangDict Android app

set -e

APK_PATH="app/build/outputs/apk/debug/app-debug.apk"

# Check if APK exists
if [ ! -f "$APK_PATH" ]; then
    echo "APK not found. Building first..."
    ./build.sh
fi

# Check if adb is available
if ! command -v adb &> /dev/null; then
    echo "ERROR: adb not found in PATH"
    echo "Please install Android SDK platform-tools"
    exit 1
fi

# Check for connected devices
echo "Checking for connected devices..."
DEVICES=$(adb devices | grep -v "List" | grep "device$" | wc -l)

if [ "$DEVICES" -eq 0 ]; then
    echo "ERROR: No Android devices connected"
    echo "Please connect a device or start an emulator"
    echo
    echo "To list devices: adb devices"
    exit 1
fi

echo "Installing APK to device..."
adb install -r "$APK_PATH"

echo
echo "Installation complete!"
echo "You can now launch LangDict on your device."

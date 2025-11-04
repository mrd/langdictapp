#!/bin/bash
# Build and install LangDict Android app in one command

set -e

echo "========================================"
echo "  LangDict - Build and Install"
echo "========================================"
echo

# Build the app
./build.sh

echo
echo "========================================"
echo

# Install the app
./install.sh

echo
echo "========================================"
echo "  All done! LangDict is ready to use."
echo "========================================"

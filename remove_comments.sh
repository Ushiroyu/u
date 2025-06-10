#!/bin/bash
for file in "$@"; do
  if [[ $file == *.java ]]; then
    # Remove block comments
    sed -i '/\/\*/,/\*\//d' "$file"
    # Remove single-line comments that start a line
    sed -i '/^\s*\/\/.*$/d' "$file"
  elif [[ $file == *.xml ]]; then
    sed -i '/<!--/,/-->/d' "$file"
  elif [[ $file == *.yml ]]; then
    sed -i '/^\s*#/d' "$file"
  fi
  # Remove empty lines
  sed -i '/^\s*$/d' "$file"
done

#!/usr/bin/env bash

function install_gradle {
  wget https://services.gradle.org/distributions/gradle-7.2-bin.zip &&
  unzip -d /opt/gradle gradle-7.2-bin.zip &&
  rm gradle-7.2-bin.zip &&
  ln -s /opt/gradle/gradle-7.2/bin/gradle /usr/local/bin
}

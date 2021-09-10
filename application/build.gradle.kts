plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.10"

    application
}

dependencies {
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("repository.comparison.userInterface.AppKt")
}

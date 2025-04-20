plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "com.az"
version = "1.0"

repositories {
    mavenLocal()
    mavenCentral()
    maven {
        name = "runelite-repo"
        url = uri("https://repo.runelite.net")
    }
}

dependencies {
    compileOnly("net.runelite:client:1.11.7-SNAPSHOT")
    testImplementation("net.runelite:client:1.11.7-SNAPSHOT")

    // ✅ JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")

    // ✅ Mockito
    testImplementation("org.mockito:mockito-core:5.11.0")
}


tasks {
    jar {
        manifest {
            attributes["Main-Class"] = "com.devaz.ironmanquesting.IronmanQuestingPlugin"
        }
    }

    // ✅ Ensure tests run using JUnit 5
    test {
        useJUnitPlatform()
    }
}

tasks {
    jar {
        manifest {
            attributes["Main-Class"] = "com.yourname.ironmanquesting.IronmanQuestingPlugin"
        }
    }
}

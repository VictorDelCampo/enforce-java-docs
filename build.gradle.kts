plugins {
    id("java")
    checkstyle
}

group = "org.example"
version = "1.0-SNAPSHOT"

checkstyle {
    toolVersion = "9.3"
}


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

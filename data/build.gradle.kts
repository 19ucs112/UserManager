plugins {
    id("java")
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.2")
    implementation("org.projectlombok:lombok:1.18.36")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}

tasks.test {
    useJUnitPlatform()
}
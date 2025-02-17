plugins {
    id("java")
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":model"))
    implementation(project(":service"))
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.2")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.4")
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
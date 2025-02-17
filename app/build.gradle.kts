plugins {
    id("java")
    application
    id("org.springframework.boot") version "3.4.2"
    id("io.spring.dependency-management") version "1.1.7"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
    implementation("org.springframework.boot:spring-boot-starter:3.4.2")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.4")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.mysql:mysql-connector-j:8.0.33")}

tasks.test {
    useJUnitPlatform()
}

tasks.bootJar {
    mainClass.set("com.adarsh.app.UserManagerApplication")
}

application {
    mainClass.set("com.adarsh.app.UserManagerApplication")
}

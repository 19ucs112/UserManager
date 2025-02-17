plugins {
	java
	id("org.springframework.boot") version "3.4.2"
	id("io.spring.dependency-management") version "1.1.7"
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(23)
	}
}

repositories {
	mavenCentral()
}
subprojects {
	apply(plugin = "java")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")
	dependencies {
		implementation("com.fasterxml.jackson.core:jackson-databind")

		implementation("org.springframework.boot:spring-boot-starter:3.4.2")
		implementation("org.springframework.boot:spring-boot-starter-web:3.4.2")
		implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.2")
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.bootJar {
	mainClass.set("com.adarsh.app.UserManagerApplication")
}

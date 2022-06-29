plugins {
    id("java")
    id("org.springframework.boot") version ("2.6.9")
    id("io.spring.dependency-management") version ("1.0.11.RELEASE")
}

group = "butler"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("mysql:mysql-connector-java:8.0.29")
    implementation("org.mybatis:mybatis:3.5.10")
    implementation("org.mybatis:mybatis-spring:2.0.7")
    implementation(project(":butler-common"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
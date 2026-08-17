import org.gradle.kotlin.dsl.repositories

plugins {
    id("java")
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val autoServiceVerion = "1.1.1"

dependencies {
    compileOnly("com.google.auto.service:auto-service:$autoServiceVerion")
    annotationProcessor("com.google.auto.service:auto-service:${autoServiceVerion}")
    implementation("com.squareup:javapoet:1.13.0")

    compileOnly(project(":annotation"))
    implementation(project(":annotation"))
}
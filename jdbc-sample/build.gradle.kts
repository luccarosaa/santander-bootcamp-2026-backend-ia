plugins {
    id("java")
}

group = "br.com.dio"
version = "2.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mysql:mysql-connector-j:9.7.0")
    implementation("org.flywaydb:flyway-core:13.3.0")
    implementation("org.flywaydb:flyway-mysql:12.3.0")
    implementation("net.datafaker:datafaker:2.7.0")

    compileOnly("org.projectlombok:lombok:1.18.46")
    annotationProcessor("org.projectlombok:lombok:1.18.46")

}

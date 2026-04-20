plugins {
    java
    scala
    application
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.7.4")
}

repositories{
    mavenCentral()
}

application{
    mainClass.set("Class1")
}
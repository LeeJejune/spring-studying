plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "eureka"
include("clientA")
include("eurekaApi")
include("clientB")

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation ("org.seleniumhq.selenium:selenium-java:4.25.0")
    implementation ("io.github.bonigarcia:webdrivermanager:5.1.0")
    implementation ("org.testng:testng:7.5")
    implementation ("io.cucumber:cucumber-java:7.18.0")
    implementation ("io.cucumber:cucumber-testng:7.2.3")
    implementation ("org.slf4j:slf4j-simple:1.7.35")
    // https://mvnrepository.com/artifact/io.github.selcukes/selcukes-extent-reports
    implementation ("io.github.selcukes:selcukes-extent-reports:2.3.12")
    // https://mvnrepository.com/artifact/junit/junit
    implementation ("io.cucumber:cucumber-junit:7.20.1")
    implementation ("io.cucumber:cucumber-java:7.2.3")
    testImplementation ("io.cucumber:cucumber-java:7.18.0")
    implementation ("io.qameta.allure:allure-cucumber7-jvm:2.28.0")
    implementation ("com.aventstack:extentreports-cucumber4-adapter:1.2.1")

    // Import allure-bom to ensure correct versions of all the dependencies are used
    testImplementation(platform("io.qameta.allure:allure-bom:2.24.0"))
    // Add necessary Allure dependencies to dependencies section
    testImplementation("io.qameta.allure:allure-cucumber7-jvm")
    testImplementation("io.qameta.allure:allure-junit-platform")
}

//    }
//}

//task cucumber() {
//    dependsOn assemble, testClasses
//    doLast {
//        javaexec {
//            main = "io.cucumber.core.cli.Main"
//            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
//            args = ['--plugin', 'html:results.html',
//                '--plugin', 'pretty',
//                '--plugin', 'io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm',
//                '--glue', 'step_definitions',
//                'src/test/resources']
//        }
//    }
//}
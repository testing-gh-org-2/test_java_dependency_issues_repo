# Test Java Dependency Issues Repository

This is a test Java Gradle project that intentionally includes a vulnerable dependency for testing purposes.

## Project Structure

```
test_java_dependency_issues_repo/
├── build.gradle
├── settings.gradle
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── App.java
│   │   └── resources/
│   │       └── log4j2.xml
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── AppTest.java
└── README.md
```

## Vulnerable Dependency

This project includes **Log4j 2.14.1**, which contains the critical **CVE-2021-44228** vulnerability (also known as Log4Shell).

**⚠️ WARNING**: This vulnerability is intentionally included for testing purposes only. Do not use this project in production environments.

### Vulnerability Details
- **Dependency**: `org.apache.logging.log4j:log4j-core:2.14.1`
- **CVE**: CVE-2021-44228
- **Severity**: Critical (CVSS 10.0)
- **Description**: Remote code execution vulnerability in Log4j

## Building the Project

```bash
./gradlew build
```

## Running the Application

```bash
./gradlew run
```

## Running Tests

```bash
./gradlew test
```

## Fixing the Vulnerability

To fix the vulnerability, upgrade Log4j to version 2.17.1 or later:

```gradle
dependencies {
    implementation 'org.apache.logging.log4j:log4j-core:2.17.1'
    implementation 'org.apache.logging.log4j:log4j-api:2.17.1'
}
```

## Purpose

This project is designed for:
- Testing dependency scanning tools
- Demonstrating vulnerability detection
- Training and educational purposes
- CI/CD pipeline testing

# Enforcer

The [enforcer plugin](https://maven.apache.org/enforcer/maven-enforcer-plugin/) may be used to verify project invariants such as:

 - Maven version used to build the project
 - Minimum/Maximum Java version required to build
 - Existence of a particular file
 - Dependency characteristics such as non-snapshot, semantic versioning, bytecode level, etc.

Build with

```sh
./mvnw verify
```

## Fail the build
To see the build fail, configure your project so it fails to meet one or more of the rules configured in the [pom.xml](./pom.xml). For example, use a version of Java older than 21 and/or a version of Maven older than 3.9.9.

If you are using [SDKMAN!](https://sdkman.io/): 
* Switch to a different Java and/or Maven version on the command line.
* Switch to the configuration present in the [`.sdkmanrc`](https://sdkman.io/usage/#env-command) file:
```sh
sdk env
```

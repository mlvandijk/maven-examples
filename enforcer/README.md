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

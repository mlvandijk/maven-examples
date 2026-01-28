# Profiles

Profiles let you enhance the build by conditionally updating properties and/or adding sections.

Build with

```sh
./mvnw verify
```

Generate Javadoc and sources JARs

```sh
./mvnw -Ppublication verify
```

Verify POM is ready for publication to Maven Central

```sh
./mvnw org.kordamp.maven:pomchecker-maven-plugin:check-maven-central
```

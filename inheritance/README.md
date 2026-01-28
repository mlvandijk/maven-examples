# Inheritance

Parent POMs can pass properties, plugin configuration, dependencies, and profiles to their children.

Build 

```sh
./mvnw verify
```

Resolved project model for all projects

```sh
./mvnw help:effective-pom -Dverbose
```

What we want to do is execute the main class in project 3

```sh
./mvnw compile exec:java
````

Resolve effective POM for a single project

```sh
./mvnw -pl :project3 help:effective-pom -Dverbose=true
```

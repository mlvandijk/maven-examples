# Dependency conflict

This project shows a dependency conflict. There are two different versions of Guava transitively found in the dependency graph.

```sh
./mvnw dependency:tree
```

Show the conflict using the enforcer

```sh
./mvnw -f pom-enforced.xml initialize
```

```sh
./mvnw -f pom-enforced.xml enforcer:enforce@check
```

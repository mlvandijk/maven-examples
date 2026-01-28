# Dependency Analysis

List dependency graph

```sh
./mvnw dependency:tree
```

List dependency list

```sh
./mvnw dependency:resolve
```

Check for dependency updates
```sh
./mvnw versions:display-dependency-updates
```

Check for plugin updates
```sh
./mvnw versions:display-plugin-updates
```

Show unused and/or undeclared dependencies

```sh
./mvnw compile
./mvnw dependency:analyze-only -DfailOnWarning=true
```

Combine both in the same execution

```sh
./mvnw compile dependency:analyze-only -DfailOnWarning=true
```

Or in a single step

```sh
./mvnw dependency:analyze -DfailOnWarning=true
```



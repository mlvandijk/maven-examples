# Vulnerabilities

Dependencies used in your project might have known vulnerabilities. It is recommended to keep your dependencies up to date to mitigate potential security risks.

See [dependencies](../dependencies/README.md) for more information on how to check for updates to dependencies using Maven.

## Vulnerable API Usage

This example demonstrates the usage of a vulnerable API that could lead to security issues in the class [`VulnerableApiUsage.java`](./src/main/java/com/acme/examples/VulnerableApiUsage.java). It showcases how to use the `jackson-databind` library in a way that may expose the application to potential vulnerabilities.
IntelliJ IDEA highlights this usage in the code and provides an intention action to **Go to file with declared dependency**, which will navigate to the pom.xml file where the dependency is declared.

Note: To see if and where vulnerable API usage is present in your project, you can use **Run Inspection by Name** to run the **Vulnerable API Usage** inspection.

For more information on how to use this inspection, see the [IntelliJ IDEA documentation](https://www.jetbrains.com/help/idea/package-analysis.html#find-vulnerable-api).

## Remediation of Jackson Vulnerability

The `jackson-databind` library version used in this example is vulnerable to deserialization attacks. It is recommended to upgrade to a newer version to mitigate these risks.
IntelliJ IDEA highlights vulnerable dependencies in the [pom.xml](./pom.xml). If a newer version is available where the vulnerability is fixed, a quick fix to upgrade to that version is provided.

To address the vulnerability, consider upgrading the `jackson-databind` library to version `2.13.4.2` or higher, which includes security patches for deserialization vulnerabilities.
Note that `2.13.4.2` (and several higher versions) still contain a _transitive_ vulnerability through a dependency on `jackson-core`.

If desired for any reason, a vulnerability can be ignored in IntelliJ IDEA. An ignored dependency will not be highlighted as vulnerable. 
To remove a dependency from the list of ignored dependencies, Go to **Settings | Editor | Inspections** and find the inspection **Vulnerable declared dependency** (in the **Security** section). In the **Options** section in the bottom right, remove the ignored dependency.

## Viewing Vulnerable Dependencies in IntelliJ IDEA
To see all vulnerable dependencies in a project, including information about the specific vulnerabilities and their severity, open the **Problems** tool window (⌘6 on macOS / Alt+6 on Windows/Linux) and go to the **Vulnerable Dependencies** tab. If needed, click the **Show results** button to display the list of vulnerable dependencies. You can expand the directories on the left and select any listed vulnerabilities there to see more details.
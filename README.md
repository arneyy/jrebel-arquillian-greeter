# jrebel-arquillian-greeter

# What it is

The "GreeterTest" uses the arquillian-jrebel-extension to echo "Hello, Earthling".

The elapsed times of the first and second test-run can be compared, as the second test-run can be performed without redeployment.

These results can be helpful for evaluation, whether "JRebel + arquillian-jrebel-extension" can speedup Testdriven-Development.


# How to run

- setup a local wildfly-server-instance with management-user/password: admin/admin
- start this server in JRebel-Mode.
- adjust the absolute-path in rebel.xml to your project-folder
- start the first test that is with deployment (use mvn clean test)
- start the second test that is without deployment (use mvn test)

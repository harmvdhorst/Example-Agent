# Example Agent

This is an example how to create a java agent for the Manipulator Library. <br>
For usage see [Manipulator](https://github.com/harmvdhorst/Manipulator) repository.

### Usage
There are 2 ways to load this java agent. Using the -javaagent flag on startup or using the java attach api

Using the -javaagent flag (use this in the run config for your application)
```

java -javaagent:YourAgentjar.jar -jar YourJarToPatch.jar

```
This will patch the specified jar when running the application

<br/>

Using the java attach api (you will need a program which can attach the agent)
```java
// sidenote: jvm has to support the attach api for this to work
import com.sun.tools.attach.VirtualMachine;

// the process id of the running application
String pid = "1234";

VirtualMachine vm = VirtualMachine.attach(pid);
vm.loadAgent("Your agent path");
vm.detach();

```
This will patch the specified jar whenever the attach api injects the agent



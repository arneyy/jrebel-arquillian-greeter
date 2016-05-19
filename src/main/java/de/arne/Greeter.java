package de.arne;

import java.io.PrintStream;

import javax.enterprise.context.RequestScoped;
@RequestScoped
public class Greeter {

	public void greet(PrintStream to, String name) {
		to.println(createGreeting(name));
	}
	
	public String createGreeting(String name) {
		return "Hello, " + name + "!";
	}
	
}

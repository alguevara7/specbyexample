package net.alexguev.specbyexample.storyname;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class GreetingTest {
	
    public String greetingFor(String firstName) {
        return String.format("Hello %s!", firstName);
    }
}
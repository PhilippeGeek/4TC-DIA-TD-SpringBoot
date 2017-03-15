package fr.insalyon.tc.dia.springboot.hello;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.context.annotation.Bean;

/**
 * Created by pvienne on 15/03/2017.
 */
public class ConsoleGreetingServiceTests {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void testGreeting() {
        ConsoleGreetingService greetingService = new ConsoleGreetingService();
        greetingService.greet("Spring");
        outputCapture.expect(Matchers.startsWith("Hello, Spring!"));
        greetingService.greet("Toto");
        outputCapture.expect(Matchers.containsString("Hello, Toto!"));
    }
}

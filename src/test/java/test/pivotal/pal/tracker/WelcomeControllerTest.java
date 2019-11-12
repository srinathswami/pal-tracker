package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.WelcomeController;
import org.assertj.core.api.AbstractCharSequenceAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeControllerTest {

    @Test
    public void itSaysHello() throws Exception {
        WelcomeController controller = new WelcomeController("A welcome message");

        AbstractCharSequenceAssert<?, String> a_welcome_message = assertThat(controller.sayHello()).isEqualTo("A welcome message");
    }
}

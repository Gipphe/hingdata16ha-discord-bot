import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.entities.impl.JDAImpl;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import org.junit.jupiter.api.Test;

class TestMessage extends MessageReceivedEvent {
    JDA api = new MockJDA();
    long responseNumber = 123;

    public TestMessage(JDA api, long responseNumber, Message message) {
        super(api, responseNumber, message);
    }

    public static TestMessage create() {
        return create(new MockMessage());
    }
    public static TestMessage create(Message message) {
        return new TestMessage(new MockJDA(), 123, message);
    }
}
class ResponderTest {

    @Test
    void should_respond_with_pong() {
        TestMessage msg = TestMessage.create();
        Responder rep = new Responder();
    }
}
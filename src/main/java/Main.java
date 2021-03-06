import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.events.message.*;
import net.dv8tion.jda.core.hooks.*;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDExMTMzOTIxNDg1Mzg5ODM0.DV3R-A.A-bNz0iKozyUFpgL7XPyENk5Pj8";
        builder.setToken(token);
        builder.addEventListener(new Main());
        JDA foo = builder.buildAsync();
    }

    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.println("Received message from " +
                event.getAuthor().getName() +
                ": " + event.getMessage().getContentDisplay()
        );

        if (event.getMessage().getContentRaw().equals("!ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}

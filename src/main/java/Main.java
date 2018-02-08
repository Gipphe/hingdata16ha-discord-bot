import net.dv8tion.jda.core.*;
import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDExMTMzOTIxNDg1Mzg5ODM0.DV3R-A.A-bNz0iKozyUFpgL7XPyENk5Pj8";
        builder.setToken(token);
        builder.addEventListener(new Responder());
        builder.buildAsync();
    }
}

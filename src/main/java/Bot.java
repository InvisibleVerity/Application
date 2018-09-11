
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import  net.dv8tion.jda.core.events.message.MessageDeleteEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter {
    public static void main(String[] args) {
        JDABuilder jda = new JDABuilder(AccountType.BOT);
        jda.setToken("NDg4NDI4NDY5MDI2MjkxNzI0.DncEFA.mci4CqfsNcV7hNiNZ1RY3YvvCds");
        jda.setAudioEnabled(false);
        jda.addEventListener(new Bot());
        jda.addEventListener(new Commands());
        try {
            jda.buildAsync();
        } catch (Exception e) {
            System.out.print("CPU Selbstzerstörung inizieirt");

        }
    }

}
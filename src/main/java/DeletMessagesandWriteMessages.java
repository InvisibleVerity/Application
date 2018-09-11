import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageHistory;

import java.util.List;
import java.lang.*;

public class DeletMessagesandWriteMessages {
    public static void run(Message msg, String beleidigung) {
        MessageHistory history = new MessageHistory(msg.getChannel());
        List<Message> msgs;
        String nachricht = msg.getContentRaw();
        String name = msg.getChannel().getName();
        String autor = msg.getAuthor().getName();
        String time = msg.getCreationTime().toString();
        msg.getChannel().sendMessage("Die Nachricht enthält ein Schimpfwort" + " (@" +  autor + ") " + "   Geschrieben: " + time).queue();

        msgs = history.retrievePast(2).complete();
        msg.getTextChannel().deleteMessages(msgs).queue();
        System.out.println(msg + "      " + name);
        System.out.println(beleidigung);
        System.out.println(time);

    }
}
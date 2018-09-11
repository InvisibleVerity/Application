import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent e) {
        String[] Message = e.getMessage().getContentRaw().replaceFirst("!", "").split(" ");
        // Anti Beleidigungen

        String Nachricht = e.getMessage().getContentRaw();
        String Beleidigungen = "ficken Arschloch Sex fuck Huren huren hure Huso kys killyourself wixer kill töten hoden scheiße Hure Nutten Hur3n Hurnes0hn mudda fettn Sackleckern spannern Tomekn tomek fanatikern ADC Ficken!";
        String[] BeleidigunsArray = Beleidigungen.split(" ");
        //int sonderBeleidigungen = BeleidigunsArray.length+1;
        //BeleidigunsArray[sonderBeleidigungen] = "h u r e n s o h n";
        int y;
        for (y = 0;y<BeleidigunsArray.length; y++){
            if (Nachricht.contains(BeleidigunsArray[y])){
                DeletMessagesandWriteMessages.run(e.getMessage(),BeleidigunsArray[y]);


            }
         // end anti beleidigungen
        }
    }
}
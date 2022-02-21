package tribes;

import oracle.Oracle;

import java.util.Random;

public class MoonWatchers {
    public MoonWatchers(){
        Oracle.getInstance().publicPrint("At night, a tribe of moon watchers appears.");
    }

    public void WatchMoon(){
        Oracle.getInstance().publicPrint("Enthralled by the light of their divinity, the moon watchers stare at the stars.");
        Random rnd = new Random();
        if(rnd.nextInt(10)>0){
            Oracle.getInstance().getAdviceInterface().GiveAdvice();
        }
        else{
            Oracle.getInstance().getPunisherInterface().Punish();
        }
    }
}

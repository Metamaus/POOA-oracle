package tribes;

import oracle.Oracle;

import java.util.Random;

public class DarkFoots {
    public DarkFoots(){
        Oracle.getInstance().publicPrint("The dark foot tribe comes to life, blessed by the Night Spirit !");
    }

    public void CallNightSpirit(){
        Oracle.getInstance().publicPrint("The dark foot tribes call for the night spirit !");
        Random rnd = new Random();
        if(rnd.nextInt(10)>0){
            oracle.Oracle.getInstance().getAdviceInterface().GiveAdvice();
        }
        else{
            oracle.Oracle.getInstance().getMiracleInterface().Realise();
        }
    }
}

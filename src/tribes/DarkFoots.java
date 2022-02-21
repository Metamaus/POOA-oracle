package tribes;

import java.util.Random;

public class DarkFoots {
    public DarkFoots(){}

    public void CallNightSpirit(){
        Random rnd = new Random();
        if(rnd.nextInt(10)>0){
            oracle.Oracle.getInstance().getAdviceInterface().GiveAdvice();
        }
        else{
            oracle.Oracle.getInstance().getMiracleInterface().Realise();
        }
    }
}

package tribes;

import oracle.Oracle;

import java.util.Random;

public class WhiteHands {
    public WhiteHands(){
        Oracle.getInstance().publicPrint("During this ice-cold winter, a tribe of white hands settles nearby.");
    }

    public void RegularCeremony(Oracle.needs myNeeds){
        Oracle.getInstance().publicPrint("With the smoke of their fires, the white hands beg their divinity for a favor.");
        Random rnd = new Random();
        if(rnd.nextInt(10)>0){
            Oracle.getInstance().getListenInterface().ListenA(myNeeds);
        }
        else{
            Oracle.getInstance().getListenInterface().ListenP(myNeeds);
        }
    }

    public void SacrificeCeremony(Oracle.needs myNeeds){
        Oracle.getInstance().publicPrint("Desperate for help, the white hands beg their divinity for a favor by sacrificing one of them.");
        Oracle.getInstance().getPunisherInterface().Sacrifice();
        Random rnd = new Random();
        if(rnd.nextInt(10)>0){
            Oracle.getInstance().getListenInterface().ListenA(myNeeds);
        }
        else{
            Oracle.getInstance().getListenInterface().ListenM(myNeeds);
        }
    }
}

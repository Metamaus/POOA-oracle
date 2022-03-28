package tribes;

import oracle.Oracle;

public class MaskedDancers {
    public MaskedDancers(){
        Oracle.getInstance().publicPrint("The masked dancers comes to this land and build their sacred totems !");
    }

    public void TotemChanting(Oracle.needs myNeeds){
        Oracle.getInstance().publicPrint("The masked dancers start to chant to their sacred totems...");
        Oracle.getInstance().getListenInterface().Listen(myNeeds);
    }

    public void ShamanTrance(){
        Oracle.getInstance().publicPrint("The masked dancers' shaman enters a deep trance.");
        Oracle.getInstance().getAdviceInterface().GiveAdvice();
    }
}

package tribes;

import oracle.Oracle;

public class MaskedDancers {
    public MaskedDancers(){}

    public void TotemChanting(Oracle.needs myNeeds){
        Oracle.getInstance().getListenInterface().Listen(myNeeds);
    }

    public void ShamanTrance(){
        Oracle.getInstance().getAdviceInterface().GiveAdvice();
    }
}

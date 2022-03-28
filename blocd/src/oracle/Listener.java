package oracle;

final class Listener extends Service implements ListenInterface{

    public Listener(){
    }

    public void Listen(Oracle.needs myNeeds){
        Oracle.getInstance().defaultPrint("The presence listens solemnly to the desperate call of the tribe for " + myNeeds + ".");
    }

    public void ListenA(Oracle.needs myNeeds){
        Oracle.getInstance().getAdvice().GiveAdvice(myNeeds);
    }

    public void ListenM(Oracle.needs myNeeds){
        Oracle.getInstance().defaultPrint("Since the tribe needs " + myNeeds + ".");
        Oracle.getInstance().getMiracle().Realise();
    }

    public void ListenP(Oracle.needs myNeeds){
        Oracle.getInstance().getPunisher().Punish(myNeeds);
    }
}

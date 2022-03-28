package oracle;

final class Punisher extends Service implements PunisherInterface{

    public Punisher(){
    }

    public void Punish(Oracle.needs myNeeds){
        Oracle.getInstance().defaultPrint("Infuriated by the tribe demand for " + myNeeds + " the spirit casts a curse upon them.");
    }
    
    public void Punish() {
        Oracle.getInstance().defaultPrint("The spirit casts a curse upon the poor tribe.");
    }

    public void Sacrifice() {
        Oracle.getInstance().defaultPrint("The spirit is pleased by the flesh sacrifice given by the tribe.");
    }


}

package oracle;


final class Advice extends Service implements AdviceInterface{
	

    public Advice(){
    }

    public void GiveAdvice(){
        Oracle.getInstance().defaultPrint("A voice gives a meaningfull advice.");
    }

    public void GiveAdvice(Oracle.needs myneeds){
        Oracle.getInstance().defaultPrint("Since the tribe needs " + myneeds + " a voice gives them proper guidance.");
    }
}
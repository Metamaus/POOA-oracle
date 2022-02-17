package monserveur;

public class Oracle {
	
	enum needs{
		
	}

    private static Oracle instance = new Oracle();
    private Advice advice;
    private Listen listen;
    private Miracle miracle;
    private Punisher punisher;

    private Oracle() {

        advice = new Advice();
        listen = new Listen();
        miracle = new Miracle();
        punisher = new Punisher();
    }

    public static Oracle getInstance() {
        return instance;
    }


    void defaultPrint(String m) {

        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m) {

        System.out.println("publicPrint : " + m);
    }

    public AdviceInterface getAdviceInterface() {

        return (AdviceInterface)advice;
    }

    public ListenInterface getListenInterface() {

        return (ListenInterface)listen;
    }
    
    public MiracleInterface getMiracleInterface() {

        return (MiracleInterface)miracle;
    }
    
    public PunisherInterface getPunisherInterface() {

        return (PunisherInterface)punisher;
    }

    Advice getAdvice() {

        return advice;
    }
    
    Listen getListen() {

        return listen;
    }
    
    Miracle getMiracle() {

        return miracle;
    }
    
    Punisher getPunisher() {

        return punisher;
    }
}
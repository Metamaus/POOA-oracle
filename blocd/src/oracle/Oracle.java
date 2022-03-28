package oracle;

public class Oracle {
	
	public enum needs{
		food,
        rain
	}

    private static final Oracle instance = new Oracle();
    private Advice advice;
    private Listener listen;
    private Miracle miracle;
    private Punisher punisher;

    private Oracle() {

        advice = new Advice();
        listen = new Listener();
        miracle = new Miracle();
        punisher = new Punisher();
    }

    
    public static Oracle getInstance() {
        return instance;
    }


    void defaultPrint(String m) {

        System.out.println("[Oracle] : " + m);
    }

    public void publicPrint(String m) {

        System.out.println("[Tribe] : " + m);
    }

    public AdviceInterface getAdviceInterface() {

        return advice;
    }

    public ListenInterface getListenInterface() {

        return listen;
    }
    
    public MiracleInterface getMiracleInterface() {

        return miracle;
    }
    
    public PunisherInterface getPunisherInterface() {

        return punisher;
    }

    Advice getAdvice() {

        return advice;
    }
    
    Listener getListen() {

        return listen;
    }
    
    Miracle getMiracle() {

        return miracle;
    }
    
    Punisher getPunisher() {

        return punisher;
    }
}
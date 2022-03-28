package oracle;

final class Miracle extends Service implements MiracleInterface{

    public Miracle(){
    }

    public void Realise(){
        Oracle.getInstance().defaultPrint(" A miracle suddenly happens !");
    }
}

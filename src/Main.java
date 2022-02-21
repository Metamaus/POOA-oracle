import oracle.*;
import tribes.*;

public class Main {

    public static void main(String[] args){

        Oracle.getInstance().publicPrint("main");

        DarkFoots Joe = new DarkFoots();
        Joe.CallNightSpirit();

        MaskedDancers Shaman = new MaskedDancers();
        Shaman.TotemChanting(Oracle.needs.food);
        Shaman.ShamanTrance();
    }
}



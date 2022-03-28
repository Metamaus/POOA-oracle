import oracle.*;
import tribes.*;
package test;

public class Main {

    public static void main(String[] args){

        Oracle.getInstance().publicPrint("Let's start !");

        DarkFoots Joe = new DarkFoots();
        Joe.CallNightSpirit();

        MaskedDancers Shaman = new MaskedDancers();
        Shaman.TotemChanting(Oracle.needs.food);
        Shaman.ShamanTrance();

        WhiteHands Henry = new WhiteHands();

        MoonWatchers Karim = new MoonWatchers();

        Henry.RegularCeremony(Oracle.needs.rain);

        Karim.WatchMoon();

        Henry.SacrificeCeremony(Oracle.needs.rain);
    }
}



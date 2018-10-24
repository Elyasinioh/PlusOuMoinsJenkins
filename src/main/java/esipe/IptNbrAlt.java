package esipe;

import java.util.Random;

public class IptNbrAlt implements INbrAleatoire{
    public int NbrAleatoire() {
        Random rd = new Random();
        return rd.nextInt(100) + 1;
    }

}


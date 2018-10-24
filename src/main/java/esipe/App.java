package esipe;


public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Voilà le jeu enfin un jeu où l'on peut parier sans perdre d'argent : Plus ou Moins" );
        INbrAleatoire game = new IptNbrAlt();
        GameEngine party = new GameEngine(game);
        party.launch();
    }
}

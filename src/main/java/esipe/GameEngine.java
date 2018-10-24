package esipe;

import java.util.*;
import java.util.Random;

class GameEngine{



    private int AltNbr;
    private INbrAleatoire service;

    public GameEngine(INbrAleatoire service) {
        this.AltNbr = service.NbrAleatoire();
        this.service = service;
    }

    public String isGood(int numberUtil) {
        if(this.AltNbr == numberUtil) {
            return " You Win !!";
        }else if(this.AltNbr > numberUtil) {
            return "C'est (un peu) plus";
        }else {
            return "C'est (un peu) moins";
        }
    }

    public void launch() {
        Utilisateur u= new Utilisateur();
        Scanner sc = new Scanner(System.in);
        int nb =sc.nextInt();
        int nbDeCoups =1;
        sc.nextLine();
        System.out.println(this.isGood(nb));
        while (!this.isGood(nb).equalsIgnoreCase("C'est bon")) {
            nb =sc.nextInt();
            nbDeCoups++;
            System.out.println(this.isGood(nb));
        }
        u.recordNbCoup(nbDeCoups);
        sc.nextLine();
        System.out.println("Try again ? (o/any) ");
        String ouiNon = sc.nextLine();

        if (retry(ouiNon)) {
            System.out.println("Nouvelle Partie - Score a battre : "+ u.getNbtry());
            this.randNew();
            this.launch();
        }

    }

    public boolean retry(String ouiNon) {
        if(ouiNon.equalsIgnoreCase("o")) {
            return true;
        }else {
            return false;
        }
    }

    public void randNew() {
        this.service.NbrAleatoire();
    }


}



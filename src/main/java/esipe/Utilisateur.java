package esipe;

public class Utilisateur {

    private String name;
    private int nbtry;

    public Utilisateur() {
        this.name="Elyass";
        this.nbtry=500;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNbtry() {
        return nbtry;
    }
    public void setNbtry(int nbessai) {
        this.nbtry = nbessai;
    }
    public void recordNbCoup(int number) {
        if(number >= this.nbtry) {
            System.out.println("Best Score : "+ this.nbtry);
        }else if (number < this.nbtry) {
            System.out.println("New Best Score : "+ number);
            this.nbtry = number;
        }
    }
}

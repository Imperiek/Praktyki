public class uczen extends human  {
    String zachowanie;
    int polski;
    int matematyka;
    int historia;
    int biologia;
    int geografia;


    public String getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(String zachowanie) {
        this.zachowanie = zachowanie;
    }

    public int getPolski() {
        return polski;
    }

    public void setPolski(int polski) {
        this.polski = polski;
    }

    public int getMatematyka() {
        return matematyka;
    }

    public void setMatematyka(int matematyka) {
        this.matematyka = matematyka;
    }

    public int getHistoria() {
        return historia;
    }

    public void setHistoria(int historia) {
        this.historia = historia;
    }

    public int getBiologia() {
        return biologia;
    }

    public void setBiologia(int biologia) {
        this.biologia = biologia;
    }

    public int getGeografia() {
        return geografia;
    }

    public void setGeografia(int geografia) {
        this.geografia = geografia;
    }

    public uczen(String name, int wiek, int wzrost, int waga, int rozmiar_buta, String kolor_wlosow, String zachowanie, int polski, int matematyka, int historia, int biologia, int geografia) {
        super(name, wiek, wzrost, waga, rozmiar_buta, kolor_wlosow);
        this.zachowanie = zachowanie;
        this.polski = polski;
        this.matematyka = matematyka;
        this.historia = historia;
        this.biologia = biologia;
        this.geografia = geografia;


    }
}

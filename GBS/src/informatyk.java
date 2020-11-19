public class informatyk extends human {
    private String ulubiony_kolor;
    String Marka_Telefonu;
    int Ulubiona_Godzina;
    String Ulubiony_Jezyk;

    public String getUlubiony_kolor() {
        return ulubiony_kolor;
    }

    public void setUlubiony_kolor(String ulubiony_kolor) {
        this.ulubiony_kolor = ulubiony_kolor;
    }

    public String getMarka_Telefonu() {
        return Marka_Telefonu;
    }

    public void setMarka_Telefonu(String marka_Telefonu) {
        Marka_Telefonu = marka_Telefonu;
    }

    public int getUlubiona_Godzina() {
        return Ulubiona_Godzina;
    }

    public void setUlubiona_Godzina(int ulubiona_Godzina) {
        Ulubiona_Godzina = ulubiona_Godzina;
    }

    public String getUlubiony_Jezyk() {
        return Ulubiony_Jezyk;
    }

    public void setUlubiony_Jezyk(String ulubiony_Jezyk) {
        Ulubiony_Jezyk = ulubiony_Jezyk;
    }

    public informatyk(String ulubiony_kolor, String marka_Telefonu, int ulubiona_Godzina, String ulubiony_Jezyk,String name,int wiek,int wzrost,int waga,int rozmiar_buta,String kolor_wlosow)
    {
        super(name,wiek,wzrost,waga,rozmiar_buta,kolor_wlosow);
        this.ulubiony_kolor = ulubiony_kolor;
        Marka_Telefonu = marka_Telefonu;
        Ulubiona_Godzina = ulubiona_Godzina;
        Ulubiony_Jezyk = ulubiony_Jezyk;


    }
}


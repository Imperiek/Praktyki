public class human {
    private String name;
    int wiek;
    int wzrost;
    int waga;
    int rozmiar_buta;
    String kolor_wlosow;

    public human(String name, int wiek, int wzrost, int waga, int rozmiar_buta, String kolor_wlosow) {
        super();
        this.name = name;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.rozmiar_buta = rozmiar_buta;
        this.kolor_wlosow = kolor_wlosow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getRozmiar_buta() {
        return rozmiar_buta;
    }

    public void setRozmiar_buta(int rozmiar_buta) {
        this.rozmiar_buta = rozmiar_buta;
    }

    public String getKolor_wlosow() {
        return kolor_wlosow;
    }

    public void setKolor_wlosow(String kolor_wlosow) {
        this.kolor_wlosow = kolor_wlosow;
    }
}

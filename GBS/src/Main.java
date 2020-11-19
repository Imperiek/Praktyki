public class Main {
    public static void main(String[] args) {
        human czlowiek1 = new human("maticiota ",17,180,200,40,"blond");
        informatyk Miroslaw = new informatyk ("czerwony","xiaomi",20,"java","maciek",17,182,72,42,"czarny");
        uczen krzysiek = new uczen ("Krzysiek",14,170,50,30,"czarny","dobre",5,3,5,3,2);
        System.out.println("dane informatyka: ");
        System.out.println("ulubiony kolor: "+Miroslaw.getUlubiony_kolor());
        System.out.println("marka telefonu: "+Miroslaw.getMarka_Telefonu());
        System.out.println("ulubiona godzina: "+Miroslaw.getUlubiona_Godzina());
        System.out.println("ulubiony jezyk: "+Miroslaw.getUlubiony_Jezyk());
        System.out.println("nazwa: "+Miroslaw.getName());
        System.out.println("wiek: "+Miroslaw.getWiek());
        System.out.println("wzrost: "+Miroslaw.getWzrost());
        System.out.println("waga: "+Miroslaw.getWaga());
        System.out.println("rozmiar buta: "+Miroslaw.getRozmiar_buta());



    }
}

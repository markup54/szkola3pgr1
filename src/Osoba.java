public abstract class Osoba {
    //z klasy abstrakcyjnej nie można utworzyć obiektu tej klasy
    public String imie; //dostępne wszedzie
    private int wiek; //hermetyzacja, dostęp tylko wklasie
    //protected w tej klasie i klasach potomnych (tylko w Javie w ramach pakietu)
    //brak modyfikatora dostepu - dostęp w pakiecie

    //przeciążanie konstruktorów
    public Osoba() {
        imie = "";
        wiek =0;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    //metody dostępowe

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<0 || wiek>110){
            this.wiek = 0;
        }
        else {
            this.wiek = wiek;
        }
    }

    @Override
    public String toString() {
        return "Osoba: " +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ' ';
    }
}

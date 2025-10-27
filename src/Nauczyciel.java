public sealed class Nauczyciel  extends Osoba implements Dyzurny permits Wychowawca {
    private String przedmiot;

    public Nauczyciel(String imie, int wiek, String przedmiot) {
        super(imie, wiek);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmiot='" + przedmiot + '\'' +
                "} " + super.toString();
    }

    @Override
    public void wykonaDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}

public class Jatek {

    private Csiga[] csigak;
    private String[] fogadasok;

    // Konstruktor
    // Csigának van színe: piros, zöld, kék és 3 db csiga van
    public Jatek() {
        this.csigak = new Csiga[3];
        this.csigak[0] = new Csiga("piros");
        this.csigak[1] = new Csiga("zöld");
        this.csigak[2] = new Csiga("kék");
        this.fogadasok = new String[]{"piros", "zöld", "kék"};
    }

    // Csiga tömb getter metódusa
    public Csiga[] getCsigak() {
        return this.csigak;
    }



}

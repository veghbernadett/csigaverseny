import java.util.Random;

public class Csiga {
    // messze = tavolsag
    private int tavolsag;
    private String szin;
    private boolean kapCsigaGyorsitot;
    private int sebesseg;

    // Konstruktor
    public Csiga(String szin) {
        this.tavolsag = 0;
        this.szin = szin;
        this.kapCsigaGyorsitot = false;
        // Alapertelmezetten 1
        this.sebesseg = 1;
    }

    // Getter és setter metódusok
    // Getter
    public int getTavolsag() {
        return tavolsag;
    }

    public String getSzin() {
        return szin;
    }

    public boolean kapottCsigaGyorsitot() {
        return kapCsigaGyorsitot;
    }

    public int getSebesseg() {
        return sebesseg;
    }

    // setter
    public void setTavolsag(int tavolsag) {
        this.tavolsag = tavolsag;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setKapCsigaGyorsitot(boolean kapCsigaGyorsitot) {

        this.kapCsigaGyorsitot = kapCsigaGyorsitot;
    }

    public void setSebesseg(int sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public String toString() {
        String gyorsito = kapCsigaGyorsitot ? "kapott csigagyorsítót" : "nem kapott csigagyorsítót";
        return szin + " csiga távolsága: " + tavolsag + ", " + gyorsito + ", sebessége: " + sebesseg;
    }

    // Csiga lépése
    public void lep() {
        if (this.kapCsigaGyorsitot) {
            this.sebesseg = 2;
        }

        Random random = new Random();
        // 0-3 közötti véletlen lépés
        int lepes = random.nextInt(4);
        // Csiga lépése
        this.tavolsag += lepes * this.sebesseg;
    }

    public void mindenErtekAlapra() {
        this.sebesseg = 1;
        this.kapCsigaGyorsitot = false;
    }
}

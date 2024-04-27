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
        Random random = new Random();
        // 0-3 közötti véletlen lépés
        int lepes = random.nextInt(4);
        // Csiga lépése
        this.tavolsag += lepes * this.sebesseg;
    }

    // Csiga gyorsitott lépése
    public void gyorsitottLep() {
        Random random = new Random();
        // 0-3 közötti véletlen lépés
        int lepes = random.nextInt(4);
        // Gyorsított lépés - duplazva
        this.tavolsag += lepes * (2 * this.sebesseg);
    }

    // Csiga kap csigagyorsítót
    public void gyorsit() {
        this.kapCsigaGyorsitot = true;
    }
}

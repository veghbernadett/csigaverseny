import java.util.Random;

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

    // Verseny metódus
    public void verseny() {

        Random random = new Random();

        // 5 kor van
        for (int kor = 1; kor <= 5; kor++) {
            System.out.println("Kör " + kor + ":");

            // Csiga kiválasztása, aki kap csigagyorsítót
            // 20% eséllyel
            if (random.nextInt(100) < 20) {
                // 0-2 közötti véletlen index - 3 db csiga van
                int index = random.nextInt(3);
                Csiga kivalasztottCsiga = this.csigak[index];
                kivalasztottCsiga.gyorsit();
                System.out.println("Csigagyorsító kapott: " + kivalasztottCsiga.getSzin());
            }

            // Csiga sebességének beállítása
            for (Csiga csiga : this.csigak) {
                if (csiga.kapottCsigaGyorsitot()) {
                    csiga.setSebesseg(csiga.getSebesseg() * 2); // Duplázás
                }
            }


            // Csiga lépése minden körben
            for (Csiga csiga : this.csigak) {
                csiga.lep();
                System.out.println(csiga);
            }
            System.out.println();

            // Nyertes kiválasztása
            int maxTavolsag = 0;
            String nyertes = "";
            for (Csiga csiga : this.csigak) {
                if (csiga.getTavolsag() > maxTavolsag) {
                    maxTavolsag = csiga.getTavolsag();
                    nyertes = csiga.getSzin();
                }
            }

            System.out.println("A nyertes: " + nyertes);

            // Fogadások ellenőrzése
            for (String fogadas : this.fogadasok) {
                if (fogadas.equals(nyertes)) {
                    System.out.println("Gratulálunk, nyertél!");
                } else {
                    System.out.println("Sajnos nem nyertél.");
                }
            }

        }
        }

}

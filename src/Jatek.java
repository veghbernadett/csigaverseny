import java.util.Random;
import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        // Tippelés
        System.out.println("Fogadjon a nyertes csigára! Válassza ki a színt (piros/zöld/kék):");
        String tipp = scanner.nextLine().toLowerCase();

        if (tipp.equals("piros") || tipp.equals("zöld") || tipp.equals("kék")) {
            System.out.println("Az Ön tippje: " + tipp);
        } else {
            System.out.println("Érvénytelen tipp! Az alapértelmezett tipp 'piros' lesz.");
            tipp = "piros";
        }

        // Kezdeti állapot kiírása
        System.out.println("Kezdeti állapot:");
        for (Csiga csiga : this.csigak) {
            System.out.println(csiga);
        }
        System.out.println();


        // 5 kor van
        for (int kor = 1; kor <= 5; kor++) {
            System.out.println("Kör " + kor + ":");

            // Csiga kiválasztása, aki kap csigagyorsítót
            Random random = new Random();
            // 0-99 közötti véletlen szám - 100%
            int esely = random.nextInt(100);
            // 20% eséllyel
            if (esely < 20) {
                // 0-2 közötti véletlen index - 3 db csiga van
                int index = random.nextInt(3);
                Csiga kivalasztottCsiga = this.csigak[index];
                kivalasztottCsiga.setKapCsigaGyorsitot(true);
                System.out.println("Csigagyorsító kapott: " + kivalasztottCsiga.getSzin());
            }

            // Csiga lépése minden körben
            for (Csiga csiga : this.csigak) {
                csiga.lep();
            }
            System.out.println();

            // Csiga állásának kiíratása
            for (Csiga csiga : this.csigak) {
                System.out.println(csiga);
            }
            // visszaállitás
            for (Csiga csiga : this.csigak) {
                csiga.mindenErtekAlapra();
            }
            System.out.println();
        }
            // Nyertes kiválasztása
            Csiga nyertesCsiga = this.csigak[0];
            for (int i = 1; i < this.csigak.length; i++) {
                if (this.csigak[i].getTavolsag() > nyertesCsiga.getTavolsag()) {
                    nyertesCsiga = this.csigak[i];
                }
            }

            System.out.println("A nyertes: " + nyertesCsiga.getSzin());

            // Fogadások ellenőrzése
            if (tipp.equals(nyertesCsiga.getSzin())) {
                System.out.println("Gratulálunk, nyertél!");
            } else {
                System.out.println("Sajnos nem nyertél.");
            }

    }

}

public class Main {
    public static void main(String[] args) {

        // Csiga objektumok létrehozása
        //Csiga pirosCsiga = new Csiga("piros");
        //Csiga zoldCsiga = new Csiga("zöld");
        //Csiga kekCsiga = new Csiga("kék");

        // Csiga tulajdonságainak beállítása
        // Piros csiga sebessége 2
        //pirosCsiga.setSebesseg(2);
        // Zöld csiga sebessége 1
        //zoldCsiga.setSebesseg(1);
        // Kék csiga sebessége 3
        //kekCsiga.setSebesseg(3);

        //System.out.println(pirosCsiga.toString());

        //Jatek ujJatek = new Jatek();

        //Csiga[] csigak = ujJatek.getCsigak();
        //for (Csiga csiga : csigak) {
        //    System.out.println(csiga.toString());
        //}

       // for (Csiga csiga : csigak) {
        //    if (csiga.getSzin().equals("piros")) {
        //        System.out.println(csiga.getSebesseg());
        //    }
        //    }

        // Játék létrehozása
        Jatek jatek = new Jatek();

        // Játék elindítása
        jatek.verseny();

        // Csiga objektumok visszakérése a Játékból
        Csiga[] csigak = jatek.getCsigak();

        // Csiga objektumok tulajdonságainak kiíratása
        //for (Csiga csiga : csigak) {
        //    System.out.println(csiga.toString());
        //}
        //for (int i = 0; i < csigak.length; i++) {
        //    System.out.println("Csiga színe: " + csigak[i].getSzin());
        //    System.out.println("Csiga távolsága: " + csigak[i].getTavolsag());
        //    System.out.println("Kapott csigagyorsító: " + csigak[i].kapottCsigaGyorsitot());
        //    System.out.println();
        //}


        }
}
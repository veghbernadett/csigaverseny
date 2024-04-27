public class Main {
    public static void main(String[] args) {

        // Csiga objektumok létrehozása
        Csiga pirosCsiga = new Csiga("piros");
        Csiga zoldCsiga = new Csiga("zöld");
        Csiga kekCsiga = new Csiga("kék");

        // Csiga tulajdonságainak beállítása
        // Piros csiga sebessége 2
        pirosCsiga.setSebesseg(2);
        // Zöld csiga sebessége 1
        zoldCsiga.setSebesseg(1);
        // Kék csiga sebessége 3
        kekCsiga.setSebesseg(3);

        System.out.println(pirosCsiga.toString());



    }
}
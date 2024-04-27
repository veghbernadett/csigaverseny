public class Main {
    public static void main(String[] args) {

        // Játék létrehozása
        Jatek jatek = new Jatek();

        // Játék elindítása
        jatek.verseny();

        // Csiga objektumok visszakérése a Játékból
        Csiga[] csigak = jatek.getCsigak();



        }
}
public class Zadanie2 {

    public boolean zadanie2(int tab1[], int tab2[]) {
//        Zadanie 2
//        Napisz program, który sprawdzi czy pierwszy i ostatni element pierwszej
//        tablicy zawierającej liczy (int) są takie same jak pierwszy i ostatni element
//        drugiej tablicy. Obie tablice zawierają liczy (inty) i obie tablice muszą mieć
//        minimum dwa elementy.
//
//                tablica1 = 50, -20, 0, 30, 40, 60, 10
//        tablica2 = 50, -20, 0, 30, 40, 60, 11
//        rezultat - false
//
//        tablica = 30, -20, 0, 30, 40, 60, 12
//        tablica = 30, -20, 0, 30, 40, 60, 12
//        rezultat - true
        if (tab1.length <  2){
            return false;
        }

        if ((tab1[0] == tab2[0]) && tab1[tab1.length - 1] == tab2[tab2.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}

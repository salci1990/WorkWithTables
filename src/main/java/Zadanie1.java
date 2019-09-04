public class Zadanie1 {

    public boolean zadanie1(int tab1[]) {
//        Zadanie 1
//        Napisz program, który sprawdzi czy pierwszy i ostatni element tablicy zawierającej
//        liczy (int) są takie same. Tablica musi mieć minimum dwa elementy.
//
//        tablica = 50, -20, 0, 30, 40, 60, 10
//        rezultat - false
//
//        tablica = 12, -20, 0, 30, 40, 60, 12
//        rezultat - true
        if (tab1.length <  2){
            return false;
        }
        if (tab1[0] == tab1[tab1.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}

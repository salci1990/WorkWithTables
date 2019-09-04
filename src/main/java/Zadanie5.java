public class Zadanie5 {

    public int zadanie5(int tab[]) {

//        Napisz program, który zamieni pierwszy i ostatni element w tablicy.
//                Minimalna długość tablicy to 1 element.
//                Sample Output:
//        tab: [20, 30, 40]
//        newTab: [40, 30, 20]
//
//        Napisz do tego testy jednostkowe.

        int result = 0;
        for (int i = 0; i < tab.length  ; i++) {
            result = tab[tab.length -1];
            tab[tab.length-1] = tab[0];
            tab[0] = result;
        }
        return result;
    }
}


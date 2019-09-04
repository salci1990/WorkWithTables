public class Zadanie6 {

    public void zadanie6() {

//        Napisz program, który przesunie wszystkie elementy tablicy o jedno miejsce w lewo.
//        Tablica składa się z liczb całkowitych. Rozmiar tablicy = 3
//
//        tab: [20, 30, 40]
//        newTab: [30, 40, 20]

        int tab1[] = new int[]{20, 30, 40};
        int value;
        int tab2[] = new int[3];
        for (int i = 0; i < tab1.length; i++) {
            if (i == 0) {
                tab2[tab2.length -1] = tab1[i];
            } else {
                tab2[i - 1] = tab1[i];
            }
        }
        for (int i = 0; i <= tab2.length -1; i++) {
            System.out.println(tab2[i]);

        }
    }
}


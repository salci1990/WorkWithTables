public class Zadanie23 {

    public void zadanie23() {

//        Napisz program, który usunie liczbę z tablicy i wszystkie
//        większe liczby znajdujące się po prawej stronie od szukanej liczby.
//
//        tab = [1,2,3,4,5,6,4,5,6,7,8,9,1,2,3]
//        szukana liczba 5
//        newTab = [1,2,3,4,4,1,2,3]

        int tab[] = new int[]{1, 2, 3, 9, 4, 5, 6, 4, 6, 7, 8, 9, 1, 2, 3};
        int value = 0;
        int n = 5;
        int nIndex = 0;
        for (int i = 0; i < tab.length; i++) {
            value = tab[i];
            if (value == n) {
                nIndex = i;
            }
        }
        int counter = 0;
        for (int i = nIndex + 1; i < tab.length; i++) {
            if (tab[i] > n) {
                counter++;
            }
        }
        int newTab[] = new int[tab.length - (counter + 1)];
        for (int i = 0, k = 0; i < nIndex; i++) {
            newTab[k++] = tab[i];
        }
        for (int i = nIndex + 1, k = nIndex; i < tab.length; i++) {
            if (tab[i] < n) {
                newTab[k++] = tab[i];
            }
        }
        for (int i = 0; i < newTab.length; i++) {
            System.out.println(newTab[i]);
        }
    }
}



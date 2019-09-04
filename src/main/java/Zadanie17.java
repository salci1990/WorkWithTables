public class Zadanie17 {

    public void zadanie17() {

        int tab[] = new int[]{1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9,};
        int counter = 0;
        int value = 4;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == value) {
                counter++;
            }
        }

        int newTab[] = new int[tab.length - counter];
        for (int i = 0, k = 0; i < tab.length; i++) {
            if (tab[i] == value) {
                continue;
            } else {
                newTab[k++] = tab[i];
            }
        }
        for (int i = 0; i < newTab.length; i++) {
            System.out.println(newTab[i]);
        }
    }
}


public class Zadanie9 {

    public void zadanie9(int n) {

//        Napisz program, który usunie dany element z tablicy liczb całkowitych.

        int tab1[] = new int[]{1, 2, 7, 11, 4, 18, 27, 5, 3};
        int newTab[] = new int[tab1.length -1];

        for (int i = 0,  k = 0; i < tab1.length; i++) {
            if (tab1[i] == n) {
                continue;
            } else {
                newTab[k++] = tab1[i];
            }
        }
        for (int i = 0; i < newTab.length; i++) {
            System.out.println(newTab[i]);
        }
    }
}

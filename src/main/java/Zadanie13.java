public class Zadanie13 {

    public void zadanie13() {

//        Napisz program, który znajdzie drugi najmniejszy element w tablicy
//        zaiwerającej liczby całkowite.
//
//                tab = 1,2,3,4,5,6,7,8,9
//        result = 8
        int tab1[] = new int[]{1, 8, 3, 4, 5, 6, 7, 2, 9};
        int value = findMaxFromArray(tab1);

        int tab2[] = removeElementFromArray(tab1, value);
        int secondMax = findMaxFromArray(tab2);

        System.out.println(secondMax);


    }

    private int[] removeElementFromArray(int[] tab1, int n) {
        int newTab[] = new int[tab1.length - 1];
        for (int i = 0,  k = 0; i < tab1.length; i++) {
            if (tab1[i] == n) {
                continue;
            } else {
                newTab[k++] = tab1[i];
            }
        }
        return newTab;
    }

    private int findMaxFromArray(int[] tab1) {
        int value = 0;
        for (int i = 0; i < tab1.length; i++) {
            value = tab1[i];
            for (int j = 0; j < tab1.length; j++) {
                if (value < tab1[j]) {
                    value = tab1[j];
                }
            }
        }
        return value;
    }
}

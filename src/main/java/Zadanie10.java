public class Zadanie10 {

    int tab1[] = new int[]{2, 7, 11, 4, 18, 27, 5, 3, 99, 1};
    //        Napisz program, który znajdzie maksymalną i
//        minimalną wartość w tablicy zawierającej liczby całkowite.

    public void zadanie10MinValue() {

        int value = 0;
        for (int i = 0; i < tab1.length; i++) {
            value = tab1[i];
            for (int j = 0; j < tab1.length; j++) {
                if (value > tab1[j]) {
                    value = tab1[j];
                }
            }
        }
        System.out.println("Min value: " + value);
    }

    public void zadanie10MaxValue() {

        int value = 0;
        for (int i = 0; i < tab1.length; i++) {
            value = tab1[i];
            for (int j = 0; j < tab1.length; j++) {
                if (value < tab1[j]) {
                    value = tab1[j];
                }
            }
        }
        System.out.println("Max value: " + value);
    }
}

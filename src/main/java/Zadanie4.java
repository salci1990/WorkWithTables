public class Zadanie4 {

    public int zadanie4() {

//        Napisz program, który pomnoży odpowiadające sobie elementy dwóch tablic.
//        Array1: [1, 3, -5, 4]
//        Array2: [1, 4, -5, -2]
//        Wynik: 1 12 25 -8
//
//        Napisz do tego testy jednostkowe.
        int tab1[] = new int[]{1, 3, -5, 4};
        int tab2[] = new int[]{1, 4, -5, -2};

        int result[] = new int[4];
        for (int i = 0; i < tab1.length; i++) {
            int value1 = tab1[i];
            int value2 = tab2[i];
            result[i] += (value1 * value2);
        }
        int value = 0;
        for (int i = 0; i < result.length; i++) {
            value = result[i];

        }
        return value;
    }
}


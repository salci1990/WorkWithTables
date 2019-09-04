public class Zadanie14 {

    public void zadanie14(int n) {

//        Napisz program, który znajdzie wszystkie pary liczb, których suma
//        jest równa innej liczbie.
//
//                suma = 6
//        tab = 1,2,3,4,5,6
//
//        result = 1,5 - 2,4

        int tab1[] = new int[]{1, 2, 3, 4, 5, 6, 12, 10, 8, 15, 10};

        int value = 0;

        for (int i = 0; i < tab1.length; i++) {
            value = tab1[i];
            for (int j = i + 1; j < tab1.length; j++) {
                if (value + tab1[j] == n) {
                    System.out.println("First value: " + value + " Second value: " + tab1[j]);
                }
            }
        }
    }
}

public class Zadanie7 {

    public void zadanie7() {

//        Napisz program, który posortuje tablicę liczb i program,
//                który posortuje tablicę Stringów.

        int tab1[] = new int[]{27, 2, 7, 11, 4, 18, 1, 5, 3};

        int temp_i = 0;
        for (int i = 0; i < tab1.length; i++) {
            temp_i = tab1[i];
            for (int j = i + 1; j < tab1.length; j++) {
                if (temp_i > tab1[j]){
                    temp_i = tab1[j];
                    tab1[j] = tab1[i];
                    tab1[i] = temp_i;
                }
            }
        }
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }
    }
}

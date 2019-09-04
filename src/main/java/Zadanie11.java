public class Zadanie11 {

    public void zadanie11() {

//        Napisz program, który znajdzie takie same wartości w tablicy liczb całkowitych.
//
//        tab = 1,2,3,2,3,4,5,6,6
//        tab2 = 2,3,6

        int tab[] = new int[]{1, 2, 3, 2, 3, 4, 5, 6, 6, 9, 8};
        int value;
        for (int i = 0; i < tab.length; i++) {
            value = tab[i];
            for (int j = i + 1; j < tab.length; j++) {
                if(value == tab[j]){
                    System.out.println(tab[j]);
                }
            }
        }
    }
}

public class Zadanie15 {

    public void zadanie15() {

//        Napisz program, który policzy wszystkie liczby parzyste i
//        nieparzyste w tablicy zawierającej liczby całkowite.
//
//                tab = 2,3,4,5,6
//
//        parzyste = 3
//        nieparzyste = 2

        int value1 = 0;
        int value2 = 0;
        int tab[] = new int[]{2, 7, 11, 4, 18, 9, 5, 3, 1};
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0){
                value1 += tab[i];
            }else{
                value2 += tab[i];
            }
        }
        System.out.println("Suma wartosci parzystych: " + value2 + "\nSuma wartosci nieparzystych: " + value1);
    }
}

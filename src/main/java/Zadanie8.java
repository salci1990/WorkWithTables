public class Zadanie8 {

    public void zadanie8() {

//        Napisz program, który policzy sumę wszystkich elementów tablicy.
//                Tablica zawiera liczby całkowite.

        int tab[] = new int[]{1, 2, 7, 11, 4, 18, 27, 5, 3};
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
                sum += (tab[i]);

        }
        System.out.println(sum);
    }
}

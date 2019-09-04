public class Zadanie25 {

    public void zadanie25() {

//        Napisz program, który znajdzie liczby większe niż średnia
//        wszystkich liczb w tablicy.
//
//                tab = [1, 4, 17, 7, 25, 3, 100]
//        średnia = 22.0
//        szukane liczby = 25 i 100

        int tab[] = new int[]{1, 4, 17, 7, 25, 3, 100};
        int tabSize = tab.length;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        result = sum / tabSize;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > result)
                System.out.println(tab[i]);
        }
    }
}

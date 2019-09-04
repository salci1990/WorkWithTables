public class Zadanie16 {

    public void zadanie16() {

//        Napisz program, który sprawdzi czy suma co trzeciego elementu w
//                tablicy = 10. Zwróć true jeżeli tak, false jeżeli nie.
//
//        tab = 1,2,[3],1,2,[3],1,2,[4] -> true
//        tab = 1,2,[3],1,2,[3],1,2,[3] -> false
        int tab1[] = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 4};
        int tab2[] = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3};
        int value1 = 0;
        int value2 = 0;
        for (int i = 2; i < tab1.length; i+=3) {
            value1 += tab1[i];
        }
        if(value1 % 10 == 0) {
            System.out.println("Suma co trzeciego elementu jest rowna 10.");
        }else {
            System.out.println("Suma co trzeciego elementu nie jest rowna 10.");
        }
    }
}

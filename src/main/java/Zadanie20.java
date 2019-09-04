public class Zadanie20 {

    public void zadanie20(int n1, int n2) {

//        Napisz program, który sprawdzi czy tablica liczb całkowitych
//        zawiera dwa elementy np 65 i 77.

        int tab[] = new int[]{1, 2, 3, 4, 5, 12, 3, 22, 85, 67, 98, 76, 53, 77};
        boolean m1 = false;
        boolean m2 = false;
        for (int i = 0; i < tab.length; i++) {
            if (n1 == tab[i]) {
                m1 = true;
            }
            if (n2 == tab[i]){
                m2 = true;
            }
        }
        if (m1 && m2){
            System.out.println("Zawiera.");
        }
    }
}

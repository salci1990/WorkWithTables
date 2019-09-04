public class Zadanie24 {

    public void zadanie24() {

//        Napisz program, który przesunie wszystkie 0 na lewą stronę
//        a wszystkie 1 na prawą stronę.
//
//                tab = [0,1,0,0,1,1,1,0,0,1,1]
//        newTab = [0,0,0,0,0,1,1,1,1,1,1]
        int tab[] = new int[]{0,1,0,0,1,1,1,0,0,1,1};
        int newTab[] = new int[tab.length];
        int value = 0;
        for (int i = 0, k = 0; i < tab.length; i++) {
            value = tab[i];
            if (value == 0){
                newTab[k++] = value;
            }
        }
        for (int i = 0, k = 0; i < tab.length; i++) {
            if (tab[i] == 1){
                newTab[k++] = value;
            }
        }
        for (int i = 0; i < newTab.length; i++) {
            System.out.println(newTab[i]);
        }
    }
}

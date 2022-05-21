import java.util.Random;

public class app1 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 15;

        int tab [] = new int[size];
        int tab1 [] = new int[size];
        int tab2 [] = new int[size];
        int tab3 [] = new int[size];

//       int tab [] = {25,7,45, 19, 30, 29, 66, 15, 9};
//        int tab = new Random().ints(15, 0 ,100).toArray();

        for (int i = 0; i < tab.length; i++) {
            tab[i]= random.nextInt(101);
            tab1[i] = tab[i];
            tab2[i] = tab[i];
            tab3[i] = tab[i];
            System.out.print(tab[i]+" ");
        }
        System.out.println();
        boolean flag;
        int j;
        do {
            flag = false;
            for (int i = 0; i < tab.length - 1; i++) {
                j = tab.length - 2 - i;
                if (tab[i] > tab[i + 1]) {
                    int w = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = w;
                    flag = true;
                }
                if (tab[j] > tab[j + 1]) {
                    int w = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = w;
                    flag = true;
                }
            }
        } while (flag);


        for (int element:tab) {
            System.out.print(element + " ");
        }
        System.out.println("--babelkowe");


//        sortowanie przez wybor

        int initial = 0;
        int replace;

        do {
            int position = initial;
            int min = tab1[initial];
            flag = false;

            for (int i = initial+1; i < tab1.length; i++) {
                if (tab1[i] < min) {
                    min = tab1[i];
                    position = i;

                }
                flag=true;
            }
            replace = tab1[initial];
            tab1[initial]=min;
            tab1[position] = replace;
            initial++;

        } while (flag);


        for (int element:tab1) {
            System.out.print(element + " ");
        }
        System.out.println("--przez wstawianie");


//        sortowanie przez wybor


        int count;
        for(j = tab2.length-1; j>0 ;j--) {
            count = j;
            int compare = tab2[count - 1];

            for (int i = count; i < tab2.length; i++) {
                if (compare > tab2[i]) {
                    tab2[i - 1] = tab2[i];
                    tab2[i] = compare;
                }
            }
        }


        for (int element:tab2) {
            System.out.print(element + " ");
        }
        System.out.println("--przez wybieranie");

//         sortowanie szybkie

        int index = 0;
        int middle = tab3.length/2;

        int pivot = tab3[middle];
        tab3[middle]=tab3[tab3.length-1];
        tab3[tab3.length-1]=pivot;

        for (int element:tab3) {
            System.out.print(element + " ");
        }
        System.out.println(pivot);


        for (int i =1; i < tab3.length-1; i++){

            if (tab3[i] < pivot) {
                replace = tab3[index];
                tab3[index] = tab3[i];
                tab3[i] = replace;
                index++;
            }
        }

        if(tab3[index]>tab3[index-1]) {
            replace = tab3[tab3.length - 1];
            tab3[tab1.length - 1] = tab3[index];
            tab3[index] = replace;
        }



        for (int element:tab3) {
            System.out.print(element + " ");
        }
        System.out.println("--sortowanie szybkie");
    }
}

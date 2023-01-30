package gyak0130;

import java.util.Scanner;

public class Gyak0130 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int egeszSzam = 0;
        double tortSzam = 2.54;
        char karakter = 'a';
        boolean logikai = true;

        String szoveg = new String();
        System.out.println("Szöveg: " + szoveg);
        int[] szamok = new int[10];
        

        

       

        System.out.println("szam: " + egeszSzam);

        if (true) {
            System.out.println("Mindig");
        } else {
            System.out.println("Soha");
        }

        int honap = 6;
//        Scanner be= new Scanner(System.in,"ISO-8859-2");
//        System.out.print("Hónap: ");
//        String adat=be.nextLine(); 
//        honap=Integer.parseInt(adat);

        int nap = 28;
        switch (honap) {
            case 2:
                nap = 28;
                break;
            case 1,3,5,7,8,10,12:
                nap = 31;
                break;
            default:
                nap = 30;
                break;
        }
        System.out.println("nap: " + nap);

        int i = 1;
//        while (i++<=10) {
//            System.out.print(i+",");
//            
//        }

        System.out.println();
        i = 1;
        do {
            if (i == 4) {
                continue;
            }
            System.out.print(i + ",");
            if (i == 8) {
                break;
            }
        } while (i++ < 10);

        System.out.println("");
        int j=1;
        for (;;) {
            System.out.print(j + ",");
            j=j+2;
            if (j>=11) break;
        }

        System.out.println("");
        String[] szinek = {"piros", "zöld", "kék"};
        for (String szin:szinek){
            System.out.print(szin+" ");
        }
        
        System.out.println("");
        int[] sokSzam={10,20,30,40};
        
        for (int k : sokSzam) {
            System.out.print(k+", ");
        }
        for (int k = 0; k<sokSzam.length; k++) {
            System.out.print(sokSzam[k]+"; ");
        }
                
        
    } // main vége

} // class vége

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-tabliczka mnozenia \n2-srednia ocen \n 3-potegi liczby 2 wyswietlane od konca nazat\n4-10 liczb losowych od -50 do 50\n 5-sumowanie elementow tablicy \n 6- sortowanie");
        int z = scan.nextInt();
        int i;
        int[] losowa;
        
        int x;
        int zmienna;
        double b;
        switch(z) {
        case 1:
            for(i = 1; i < 10; ++i) {
                for(int j = 1; j < 10; ++j) {
                    i = i * j;
                    System.out.print(i + "\t");
                }

                System.out.println("");
            }

            return;
        case 2:
            System.out.println("Podaj wielkosc tablicy i liczby");
            i = scan.nextInt();
            b = 0.0D;
            double[] tab = new double[i];

            for(zmienna = 0; zmienna < i; ++zmienna) {
                System.out.println("podaj kolejne liczby");
                tab[zmienna] = (double)scan.nextInt();
                b += tab[zmienna];
            }

            double c = b / (double)i;
            System.out.println("Srednia to" + c);
            break;
        case 3:
            System.out.println("od ktorej potegi chcesz zaczac?");
            int m =scan.nextInt();
            for(i = m; i > 0; --i) {
                b = Math.pow(2.0D, (double)i);
                System.out.print(b + "   ");
            }

            return;
        case 4:
            Random generator = new Random();
            losowa = new int[10];

            for(i = 1; i < 11; ++i) {
                x = generator.nextInt(2);
                if (x == 1) {
                    zmienna = generator.nextInt(50);
                    losowa[i] = zmienna;
                } else {
                    zmienna = generator.nextInt(50) - 50;
                    losowa[i] = zmienna;
                }

                System.out.println(losowa[i]);
            }

            return;
        case 5:
            System.out.println("napisz wielkosc tablicy");
            i = scan.nextInt();
            int wartosc=0;
            int tablica[]= new int[i];
             System.out.println("wypisz elementy tablicy ktore chcesz sumowac");
            for (int j=0;j<i;j++)
              {
                tablica[j]=scan.nextInt();
                wartosc=wartosc+tablica[j];
              }System.out.println(wartosc);
            break;
        case 6:
            System.out.println("podaj wielkosc tablicy");
            i = scan.nextInt();
            losowa = new int[i + 1];
            System.out.println("podaj elementy tablicy");

            for(i = 0; i <= i; ++i) {
                losowa[i] = scan.nextInt();
            }

            Arrays.toString(losowa);
            Arrays.sort(losowa);
            System.out.println(Arrays.toString(losowa));
        }

    }
}
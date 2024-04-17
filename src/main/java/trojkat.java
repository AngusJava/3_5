import java.util.Scanner;


public class trojkat {
  public static void main(String[] args) {
    System.out.println("Podaj wielkosc: ");
    Scanner wielkosc = new Scanner(System.in);
    int wielkosc_Pobieranie = wielkosc.nextInt();
    System.out.println("Podaj z jakiego znaku ma byc zrobione ");
    Scanner znak = new Scanner(System.in);
    char znak_Pobieranie = znak.next().charAt(0);


    
    for (int i = 1; i <= wielkosc_Pobieranie; i++) {
      for (int j = 1; j <= wielkosc_Pobieranie - i; j++) {
        System.out.print("  ");
      }

      for (int k = 1; k <= i; k++) {
        if (i == 1 || i == wielkosc_Pobieranie || k == 1 || k == i) {
          System.out.print(znak_Pobieranie + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
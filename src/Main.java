import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dispenser dispenser = new Dispenser();

    int option = 1000;
    while(option != 0){
      System.out.println("1. Agregar bola. \n2. Lanzar bola. \n3. Imprimir bolas disponibles. \n0. Salir.");
      option = sc.nextInt();
      switch (option) {
        case 1 -> dispenser.addBall();
        case 2 -> dispenser.throwBall();
        case 3 -> dispenser.printAvailableBalls();
        default -> System.out.println("Opción no válida.");
      }
    }
  }
}
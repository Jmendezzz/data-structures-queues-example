public class Dispenser {
  public Node head;
  public Node tail;

  public Dispenser() {
    this.head = null;
    this.tail = null;
  }
  public void addBall(){
    if(tail == null){
      Node newBall = new Node(new Ball("Green"),null);
      head = newBall;
      tail = newBall;
      printAvailableBalls();
      return;
    }

    Node newBall = new Node(new Ball("Green"),null);
    tail.nextBall = newBall;
    tail = newBall;

    printAvailableBalls();
  }
  public void throwBall(){
    if(head == null){
      System.out.println("No hay bolas disponibles para lanzar.");
      return;
    }
    if(head.nextBall == null ){
      System.out.println("Lanzando... está es la última bola disponible, por favor agrega más bolas.");
      head = null;
      tail = null;
      return;
    }

    System.out.println("Lanzando...");
    Node aux = head;
    head = head.nextBall;
    aux = null;
    printAvailableBalls();

  }

  public void printAvailableBalls(){
    Node aux = head;
    int countBalls = 0;
    while(aux != null){
      aux = aux.nextBall;
      countBalls++;
    }
    System.out.println("Quedan disponibles " + countBalls + " bolas.");
  }

}

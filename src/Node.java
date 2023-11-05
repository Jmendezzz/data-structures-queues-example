public class Node {
  public Ball ball;
  public Node nextBall;

  public Node(Ball ball, Node nextBall) {
    this.ball = ball;
    this.nextBall = nextBall;
  }
}

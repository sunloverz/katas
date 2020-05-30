import junit.framework.TestCase;
import org.junit.Assert;

public class GameTest extends TestCase {
  private Game game;

  protected void setUp(){
    game = new Game();
  }

  public void testGutterGame(){
    rollMany(20, 0);
    Assert.assertEquals(0, game.score());
  }

  public void testAllOnes() {
    rollMany(20, 1);
    Assert.assertEquals(20, game.score());
  }

  public void testOneSpare() {
    rollSpare();
    game.roll(3);
    rollMany(17, 0);
    assertEquals(16, game.score());
  }

  public void testOneStrike() {
    rollStrike();
    game.roll(3);
    game.roll(4);
    rollMany(16, 0);
    assertEquals(24, game.score());
  }

  private void rollStrike() {
    game.roll(10);
  }

  private void rollMany(int n, int pins) {
    for (int i=0;i<n;i++)
      game.roll(pins);
  }

  private void rollSpare() {
    game.roll(5);
    game.roll(5);
  }
}

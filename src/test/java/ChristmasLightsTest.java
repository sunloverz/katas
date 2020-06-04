import junit.framework.TestCase;

public class ChristmasLightsTest extends TestCase {
  private ChristmasLights lights;

  public void setUp(){
    lights = new ChristmasLights();
  }

  public void testTurnOnTheLights() {
    lights.turnOnAt(0, 0, 100, 200);
    assertEquals(1, lights.get(4, 5));
    assertEquals(0, lights.get(500, 500));
  }

  public void testToggle() {
    lights.turnOnAt(0, 0, 999, 999);
    lights.toggle(0, 0, 999, 0);
    assertEquals(3, lights.get(0, 0));
    for(int x=0;x<1000;x++)
      assertEquals(3, lights.get(x, 0));
  }

  public void testTurnOff() {
    lights.turnOnAt(0, 0, 999, 999);
    lights.turnOffAt(499, 499, 500, 500);
    assertEquals(0, lights.get(499, 499));
    assertEquals(0, lights.get(500, 500));
  }
}

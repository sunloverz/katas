import junit.framework.TestCase;

public class CalcStatsTest extends TestCase {
  private CalcStats stats;

  protected void setUp(){
    stats = new CalcStats(new int[]{6, 9, 15, -2, 92, 11});
  }
  public void testMin() {
    assertEquals(-2, stats.min());
  }

  public void testMax(){
    assertEquals(92, stats.max());
  }

  public void testSize(){
    assertEquals(6, stats.size());
  }

  public void testAverage(){
    assertEquals(21, stats.average());
  }
}

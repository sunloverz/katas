import junit.framework.TestCase;

import java.util.List;
import java.util.concurrent.CompletionService;

public class CustomListTest extends TestCase {

  private CustomList list;

  protected void setUp() {
    list = new CustomList();
  }

  public void testIsEmpty(){
    assertTrue(list.isEmpty());
    list.add(1);
    assertFalse(list.isEmpty());
  }

  public void testSize() {
    assertEquals(0, list.size());
    list.add(1);
    assertEquals(1, list.size());
  }

  public void testGet() {
    list.add(12);
    list.add(13);
    assertEquals(12, list.get(0));
    assertEquals(13, list.get(1));
  }

  public void testRemove() {
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.remove(1);
    assertEquals(1, list.get(0));
    assertEquals(3, list.get(1));
    list.remove(0);
    assertEquals(3, list.get(0));
    assertEquals(4, list.get(1));
  }

  public void testAdd() {
    boolean succeeded = list.add(14);
    assertTrue(succeeded);
  }
}

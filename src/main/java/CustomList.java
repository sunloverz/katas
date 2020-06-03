
public class CustomList {
  private Integer[] internal;
  private int size;

  public CustomList(){
    internal = new Integer[100];
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean add(Integer number) {
    doubleSize();
    internal[size++] = number;
    return true;
  }

  private void doubleSize() {
    if(size>internal.length) {
      internal = new Integer[size*2];
    }
  }

  public int size() {
    return size;
  }

  public int get(int index) {
    return internal[index];
  }

  public boolean remove(int index) {
    for(int i=index;i<size;i++) {
      internal[i] = internal[i+1];
    }
    return true;
  }
}

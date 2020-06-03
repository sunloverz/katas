import java.util.Collection;
import java.util.Collections;

public class CalcStats {
  private final int[] numbers;

  public CalcStats(int[] numbers) {
    this.numbers = numbers;
  }

  public int min() {
    int min = Integer.MAX_VALUE;
    for(int val:numbers)
      min = Math.min(min, val);
    return min;
  }

  public int max() {
    int max = Integer.MIN_VALUE;
    for(int val:numbers)
      max = Math.max(max, val);
    return max;
  }

  public int size() {
    return numbers.length;
  }

  public int average() {
    int sum = 0;
    for(int val:numbers)
      sum += val;
    return sum/size();
  }
}

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void leavesNormalNumbersAlone() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    Assert.assertEquals("1", fizzbuzz.convert(1));
    Assert.assertEquals("2", fizzbuzz.convert(2));
  }

  @Test
  public void multiplesOfThree(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertEquals("fizz", fizzBuzz.convert(3));
    Assert.assertEquals("fizz", fizzBuzz.convert(6));
  }

  @Test
  public void multiplesOfFive(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertEquals("buzz", fizzBuzz.convert(5));
    Assert.assertEquals("buzz", fizzBuzz.convert(10));
  }

  @Test
  public void multipliesOfThreeAndFive(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertEquals("fizzbuzz", fizzBuzz.convert(15));
    Assert.assertEquals("fizzbuzz", fizzBuzz.convert(30));
  }
}


public class Game {
  private final int[] rolls = new int[22];
  private int currentRole=0;

  public void roll(int pins) {
    rolls[currentRole++] = pins;
  }

  public int score() {
    int score = 0;
    int frameIndex = 0;
    for(int frame=0;frame<10;frame++) {
      if (isStrike(frameIndex)) {
        score += 10 + strikeBonus(frameIndex);
        frameIndex++;
      } else if (isSpare(frameIndex)){
        score += 10 + spareBonus(frameIndex);
        frameIndex+=2;
      } else {
        score += sumOfBallsInFrame(frameIndex);
        frameIndex+=2;
      }
    }
    return score;
  }

  private int sumOfBallsInFrame(int frameIndex) {
    return rolls[frameIndex]+rolls[frameIndex+1];
  }

  private int strikeBonus(int frameIndex){
    return rolls[frameIndex + 1] + rolls[frameIndex + 2];
  }

  private int spareBonus(int frameIndex) {
    return rolls[frameIndex+2];
  }

  private boolean isStrike(int i) {
    return rolls[i] == 10 || rolls[i+1]== 10;
  }

  private boolean isSpare(int i) {
    return rolls[i] == 10;
  }
}

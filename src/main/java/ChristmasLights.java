public class ChristmasLights {
  private int[][] lights;

  public ChristmasLights(){
    lights = new int[1000][1000];
  }

  public void turnOnAt(int x1, int y1, int x2, int y2) {
    for(int i=x1;i<=x2;i++) {
      for(int j=y1;j<=y2;j++) {
        lights[i][j] += 1;
      }
    }
  }

  public int get(int x, int y) {
    return lights[x][y];
  }

  public void turnOffAt(int x1, int y1, int x2, int y2) {
    for(int i=x1;i<=x2;i++) {
      for(int j=y1;j<=y2;j++) {
        lights[i][j] -= 1;
      }
    }  }

  public void toggle(int x1, int y1, int x2, int y2) {
    for(int i=x1;i<=x2;i++) {
      for(int j=y1;j<=y2;j++) {
        lights[i][j] += 2;
      }
    }
  }
}

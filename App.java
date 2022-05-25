import java.util.Arrays;
class App {
  public static void main(String args[]){
    App.calculateMedian();
    App.calculateMean();
    App.calculateHighScore();
    App.calculateLowScore();
  }

  private static int[] testScores = {72, 95, 91, 85, 87, 51, 65, 72, 75, 89};

  private static void calculateMedian(){
    Arrays.sort(testScores);
    System.out.println(("The median test score was: " +(testScores[4] + testScores[5]) / 2));
  }

  private static void calculateMean(){
    int sum = 0;
    for(int score: testScores) {
      sum = sum + score;
    }
    System.out.println(("The average test score was: " +sum/testScores.length));
  }

  private static void calculateHighScore(){
    System.out.println(("The highest test score was: " +Arrays.stream(testScores).max().getAsInt()));
  }

  private static void calculateLowScore(){
    System.out.println(("The lowest test score was: " +Arrays.stream(testScores).min().getAsInt()));
  }

}

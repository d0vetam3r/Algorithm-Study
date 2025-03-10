import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println(countSugar(n));
  }

  private static int countSugar(int n) {
    for (int i = n / 5; i >= 0; i--) {
      int weight = n;
      weight -= 5 * i;
      if (weight % 3 == 0) {
        return i + weight / 3;
      }
    }
    return -1;
  }
}

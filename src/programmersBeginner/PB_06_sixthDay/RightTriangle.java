package programmersBeginner.PB_06_sixthDay;

// "*"의 높이와 너비가 1이라고 했을 때, "*"을 이용해 지각 이등변 삼각형을 그리려고 합니다.
// 정수 n이 매개변수로 주어질 때, 직각 이등변 삼각형을 return 하도록 solution 메소드를 완성해주세요.

import java.util.Scanner;

public class RightTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하세요 : ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("*");
    }

  }
}

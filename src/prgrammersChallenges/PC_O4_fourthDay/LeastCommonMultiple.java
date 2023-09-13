package prgrammersChallenges.PC_O4_fourthDay;

// 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을
// 아니라면 0을 return하도록 solution 함수를 완성해주세요.

public class LeastCommonMultiple {
  public static void main(String[] args) {
    int number = 55;
    int n = 10;
    int m = 5;
    System.out.println(solution(number, n, m));
  }
  static int solution(int number, int n, int m) {
    int answer = 0;

    if (number % n == 0 && number % m == 0) {
      answer = 1;
    } else {
      answer = 0;
    }

    return answer;
  }
}

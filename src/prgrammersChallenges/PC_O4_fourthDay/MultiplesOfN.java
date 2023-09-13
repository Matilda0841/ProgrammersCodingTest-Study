package prgrammersChallenges.PC_O4_fourthDay;

// 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return
// n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.


public class MultiplesOfN {
  public static void main(String[] args) {
    int n = 2;
    int num = 98;
    System.out.println(solution(n, num));
  }

  static int solution(int n, int num) {
    int answer = 0;

    if (num % n == 0) {
      answer = 1;
    }

    return answer;
  }
}

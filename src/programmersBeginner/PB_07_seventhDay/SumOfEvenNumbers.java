package programmersBeginner.PB_07_seventhDay;

// 정수 n이 매개변수로 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하도록 solution을 완성해 주세요.

public class SumOfEvenNumbers {
  static int solution(int n){
    int answer = 0;
      for (int i = 1; i <= n; i++) {
        if (i % 2 == 0){
          answer += i;
        }
      }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(10));
  }
}

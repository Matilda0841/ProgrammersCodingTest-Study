package programmersBeginner.secondDay;

// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에, 1000을 곱한 후 정수 부분을 return하는 solution 메소드를 완성해주세요.

public class Division {

  public void main(String[] args) {
    Solution solution = new Solution();
    int num1 = 5;
    int num2 = 2;
    System.out.println(solution.solution(num1, num2));
  }

  class Solution {
    public int solution(int num1, int num2) {
      int answer = 0;
      if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
        answer = (int) (num1 * 1.0 / num2 * 1.0 * 1000);
      }
      return answer;
    }
  }
}

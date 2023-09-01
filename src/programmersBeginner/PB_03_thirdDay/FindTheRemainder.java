package programmersBeginner.PB_03_thirdDay;

// 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 나머지를 return하는 solution 함수를 완성해주세요.

public class FindTheRemainder {
  public static void main(String[] args) {
    Solution solution = new Solution();

    int num1 = 3;
    int num2 = 2;

    System.out.println(solution.solution(num1, num2));
  }

  static class Solution {
    public int solution(int num1, int num2) {
      int answer = num1 % num2;
      return answer;
    }
  }
}

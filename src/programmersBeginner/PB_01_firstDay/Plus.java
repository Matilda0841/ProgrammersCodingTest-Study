package programmersBeginner.PB_01_firstDay;

// 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하는 함수, solution을 완성해주세요.

public class Plus {
  public void main(String[] args) {
    Solution solution = new Solution();
    int num1 = 3;
    int num2 = 4;
    int answer = solution.solution(num1, num2);
    System.out.println(answer);
  }

  class Solution {
    public int solution(int num1, int num2) {
      int answer = 0;
      if (-50001 < num1 && num1 < 50001 && -50001 < num2 && num2 < 50001) {
        answer = num1 + num2;
      }
      return answer;
    }
  }
}

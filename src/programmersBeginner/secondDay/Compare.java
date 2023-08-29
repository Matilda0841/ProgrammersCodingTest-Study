package programmersBeginner.secondDay;

// 정수 num1과 num2가 매개변수로 주어질 때, 두 수가 같은면 1, 다르면 -1을 return하는 solution 메소드를 완성해주세요.

public class Compare {

  public void main(String[] args) {
    Solution solution = new Solution();
    int num1 = 5;
    int num2 = 2;

    System.out.println(solution.solution(num1, num2));
  }

  class Solution {
    public int solution(int num1, int num2) {
      int answer = 0;
      if (0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000) {
        if (num1 == num2) {
          answer = 1;
        } else {
          answer = -1;
        }
      }
      return answer;
    }
  }
}

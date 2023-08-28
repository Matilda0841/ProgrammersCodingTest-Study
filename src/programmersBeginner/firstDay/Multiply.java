package programmersBeginner.firstDay;

// 정수 num1,num2가 매개변수로 주어질 때 num1과 num2를 곱해서 return하는 함수, solution을 완성해주세요.

public class Multiply {
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
      if(0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100 ){
        answer = num1 * num2;
      }
      return answer;
    }
  }
}

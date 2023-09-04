package programmersBeginner.PB_O5_fifthDay;

// 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한 잔에 5,500원입니다.
// 머쓱이가 가지고 있는 돈 money가 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
// 남는 돈을 순서대로 배열을 return 하도록 solution 메서드를 완성해주세요.

import java.util.Arrays;

public class IceAmericano {
  public static void main(String[] args) {

    Solution solution = new Solution();
    int money = 15000;


    System.out.println(Arrays.toString(solution.solution(money)));
  }

  static class Solution {
    public int[] solution(int money) {

      int[] answer = new int[2];

      if (money % 5500 == 0) {
        answer[0] = money / 5500;
        answer[1] = 0;
      } else {
        answer[0] = money / 5500;
        answer[1] = money % 5500;
      }
      return answer;
    }
  }
}
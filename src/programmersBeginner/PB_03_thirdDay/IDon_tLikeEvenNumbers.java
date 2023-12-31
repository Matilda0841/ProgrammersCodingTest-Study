package programmersBeginner.PB_03_thirdDay;

// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하는 solution 함수를 완성해주세요.

import java.util.Arrays;

public class IDon_tLikeEvenNumbers {
  public static void main(String[] args) {
    int n = 10;
    Solution solution = new Solution();

    System.out.println(Arrays.toString(solution.solution(n)));
  }


static class Solution {
  public int[] solution(int n) {

    int[] answer = new int[(n + 1) / 2];

    int index = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        answer[index++] = i;
      }
    }
    return answer;
  }
}


}

package programmersBeginner.thirdDay;

// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return하도록 solution 함수를 완성해주세요.

// 최빈값이 여러개라면 -1을 return하도록 합니다.

import java.util.Arrays;

public class ReplayFindTheMode {
  public static void main(String[] args) {
    int[] array = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5};
    Solution solution = new Solution();
    System.out.println(solution.solution(array));
  }

  static class Solution {
    public int solution(int[] array) {
      int answer = 0;

      Arrays.sort(array);

      int max = array[array.length - 1]; // array의 최대값
      int[] count = new int[max + 1];

      for (int j : array) {
        count[j]++;
      }

      int top = count[0];

      for (int i = 0; i < count.length; i++) {
        if (top < count[i]) {
          top = count[i];
          answer = i;
        } else if (top == count[i] && i != answer) {
          answer = -1;
        }
      }

      return answer;
    }
  }
}

package programmersBeginner.PB_03_thirdDay;

// 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬 했을 때 가장 중앙에 위치하는 값을 의미합니다.
// 예를 들어 1,2,7,10,11 의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때 중앙 값을 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

public class FindTheMedian {
  public static void main(String[] args) {
    int[] array = {-9, 1, 0};

    Solution solution = new Solution();

    System.out.println(solution.solution(array));
  }

  static class Solution {
    public int solution(int[] array) {
      int answer = 0;
      Arrays.sort(array);
      answer = array[array.length / 2];
      return answer;
    }
  }
}


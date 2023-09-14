package prgrammersChallenges.PC_O6_sixthDay;

// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
// queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다. 각 query마다 순서대로
// arr[i]의 값과 arr[j]의 값을 서로 바꿉니다. 위 규칙에 따라 queries를 처리한 이후의
// arr를 return 하는 solution 함수를 완성해 주세요.

import java.util.Arrays;

public class SequenceAndIntervalQuery3 {
  public static void main(String[] args) {
    int [] arr = {0,1,2,3,4};
    int [] [] queries = {{0,3}, {1,2},{1,4}};
    System.out.println(Arrays.toString(solution(arr, queries)));
  }
  static int[] solution(int[] arr, int[][] queries) {
    int[] answer = {};

    for (int [] query : queries) {
      int i = query[0];
      int j = query[1];
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
      answer = arr;
    return answer;

  }
}

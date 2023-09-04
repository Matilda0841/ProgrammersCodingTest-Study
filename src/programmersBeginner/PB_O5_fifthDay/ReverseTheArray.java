package programmersBeginner.PB_O5_fifthDay;

// 정수가 들어 있는 배열 num_list 가 주어질 때, num_list 원소의 순거를 거꾸로 뒤집은 배열을
// return 하는 함수, solution 을 작성해주세요.

import java.util.Arrays;

public class ReverseTheArray {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int [] num_list = {1,2,3,4,5};

    System.out.println(Arrays.toString(solution.solution(num_list)));
  }

  static class Solution{
    public int [] solution (int [] num_list){
      int [] answer = {};

      answer = new int [num_list.length];

      for (int i = 0; i< num_list.length; i++){
        answer[i] = num_list[num_list.length-1-i];
      }
      return answer;
    }
  }
}

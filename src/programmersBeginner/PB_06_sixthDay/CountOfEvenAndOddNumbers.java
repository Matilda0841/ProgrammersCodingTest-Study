package programmersBeginner.PB_06_sixthDay;

// 정수가 담긴 리스트 num_list가 매개변수로 주어질 때, num_list의 원소 중
// 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해 주세요

import java.util.Arrays;

public class CountOfEvenAndOddNumbers {
  static int [] solution (int [] num_list){
   int [] answer = new int [2];
   for (int i = 0; i < num_list.length; i++) {
      if(num_list[i] % 2 == 0){
        answer[0]++;
      } else if (num_list[i] % 2 == 1){
        answer [1]++;
      }
   }
   return answer;
  }

  public static void main(String[] args) {
    int [] num_list = {1,2,3,4,5};

    System.out.println(Arrays.toString(solution(num_list)));
  }

}

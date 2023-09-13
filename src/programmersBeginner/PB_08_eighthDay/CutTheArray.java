package programmersBeginner.PB_08_eighthDay;

// 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
// numbers의 num1번 째 인덱스부터 num2 번째 인덱스까지 자른 정수 배열을 return 하도록 solution 메소드를 완성해주세요.

import java.util.Arrays;

public class CutTheArray {
  public static void main(String[] args) {

    int [] numbers = {1,2,3,4,5};
    int num1 = 3;
    int num2 = 4;

    System.out.println(Arrays.toString(solution(numbers, num1, num2)));
  }

  static int [] solution (int [] numbers, int num1, int num2){
    int [] answer =  {};

    int [] desc = Arrays.copyOfRange(numbers, num1, num2+1);

    answer = desc;


    return answer;
  }
}

package programmersBeginner.PB_04_fourthDay;

// 머쓱이네 피자 가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠 먹을 사람의 수 n이 매개변수로 주어질 때,
// n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을
// 시켜야 하는 지를 return 하도록 solution 함수를 완성해주세요.

// 최소 공배수란
// 두 개 이상의 자연수의 공통된 배수 중에서 가장 작은 수를 의미함
// 공식은 LCM(a,b)=a*b/GCD(a,b)

public class DivideThePizza2 {
  public static void main(String[] args) {

    Solution solution = new Solution();

    int n = 10;

    System.out.println(solution.solution(n));
  }

  public static int getGCD(int num1, int num2) {
    if (num1 % num2 == 0) {
      return num2;
    }
    return getGCD(num2, num1 % num2);
  }

  // 최대 공약수 공식!!
  static class Solution {
    public int solution(int n) {
      int answer = 0;
      int pizza = 6;

      int lcm = n * pizza / getGCD(n, pizza);

      System.out.println(lcm);

      answer = lcm / pizza;
      return answer;
    }
  }
}

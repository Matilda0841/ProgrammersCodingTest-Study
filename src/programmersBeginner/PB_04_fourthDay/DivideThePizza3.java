package programmersBeginner.PB_04_fourthDay;

// 머쓱이네 피자 가게는 피자를 두 조각에서 10 조각까지 원하는 수로 잘라 줍니다.
// 피자 조각 수 slice와 피자를 먹는 사람읜 수 n이 매개변수로 주어질 때, n명의 사람이
// 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는 지를 return하도록 solution함수를 완성 하세요

public class DivideThePizza3 {
  public static void main(String[] args) {

    Solution solution = new Solution();

    int slice = 7;
    int n = 14;

    System.out.println(solution.solution(slice, n ));
  }

  static class Solution{
    public int solution (int slice, int n){

      double pizza = Math.ceil((double)n/slice);

      return (int) pizza;
    }
  }
}

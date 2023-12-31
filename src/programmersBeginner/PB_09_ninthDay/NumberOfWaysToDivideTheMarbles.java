package programmersBeginner.PB_09_ninthDay;

// 머쓱이는 친구들과 구슬을 나눠가지려고 하는데 머쓱이가 갖고 있는 구슬의 개수 balls와
// 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중
// share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해 주세요.

public class NumberOfWaysToDivideTheMarbles {
  public static void main(String[] args) {
    int balls = 5;
    int share = 3;
    System.out.println(solution(balls, share));
  }

  static int solution(int balls, int share) {
    return combination(balls, share);
  }

  public static int combination(int balls, int share) {
    if (balls == share || share == 0) return 1;
    return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
  }
}

package programmersBeginner.PB_09_ninthDay;

// 개미 군단이 사냥감의 체력에 딱 맞는 병력으로 데리고 나가려고 합니다. 장군 개미는 5 공격력,
// 병정 개미는 3 공격력, 일개미는 1 공격력을 가지고 있습니다.
// 사냥감의 hp가 매개변수로 주어질 때, 체략에 딱 맞게 최소한의 병력으로 구성하려면 몇마리의 개미가
// 필요한지 return 하도록 solution 메소드를 완성해 주세요.

public class AntArmy {
  public static void main(String[] args) {
    int hp = 24;
    System.out.println(solution(hp));
  }

  static int solution (int hp){
    int answer = 0;

    int general = 5;
    int soldier = 3;
    int ant = 1;

    answer += hp/general;
    hp = hp%general;

    answer += hp/soldier;
    hp = hp%soldier;

    answer += hp/ant;
    return answer;
  }
}



public class Student {
    String name;
    int score;
    static final int MAX_SCORE = 100;

    void setScore(int newScore){
        score = newScore;
    }
    void setName(String newName){
        name = newName;
    }
    void printScore(){
        System.out.println(name + "さんの点数は" + score "点です！！");
    }

    int getScore(){
        return score;
    }

}

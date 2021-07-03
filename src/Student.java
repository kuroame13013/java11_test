
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
    void printScore(int maxScore){
        System.out.println("今回テストの満点は" + maxScore + "点です！");
        System.out.println(name + "さんの点数は" + score + "点です！！");
    }

    void printScore(){
        printScore(MAX_SCORE);
    }

    int getScore(){

        return score;
    }

}

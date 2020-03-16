import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Que {

    private int N = 10;
    ArrayList<ArrayList<Integer>> ques = new ArrayList();
    ArrayList<Integer> que;
    int name;

    public ArrayList<ArrayList<Integer>> createQues() {

        name = 1;
        for(int i=1; i<=N; i++) {
            que = new ArrayList();

            for(int j=1; j<=N; j++) {
                que.add(name);
                name ++;
            }

            ques.add(que);
        }
        N--;
        System.out.println(ques);
        return ques;
    }

    public ArrayList<ArrayList<Integer>> onToNextQues() {
        ArrayList<ArrayList<Integer>> ques1 = new ArrayList<>();

        for(int i=1; i<=N; i++) {
            Random random = new Random();
            ArrayList<Integer> que1 = new ArrayList();

          for(int j=1; j<=N; j++) {
              int rand = random.nextInt(N);
              int addToNewList = (ques.get(rand).get(0));
              que1.add(addToNewList);

              ques.remove(que.remove(0));
            }
            ques1.add(que1);
        }
        N--;
       //onToNextQues();
        System.out.println(ques1);
        return ques1;
    }
}

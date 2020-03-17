import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Que {

    private int N = 10;
    ArrayList<ArrayList<Integer>> ques = new ArrayList();

    int name;

    public ArrayList<ArrayList<Integer>> createQues() {

        name = 1;
        for(int i=1; i<=N; i++) {
            ArrayList<Integer> que = new ArrayList();

            for(int j=1; j<=N; j++) {
                que.add(name);
                name ++;
            }

            ques.add(que);
        }
        System.out.println(ques);
        return ques;
    }

    public void onToNextQues() {
        ArrayList<ArrayList<Integer>> ques1 = new ArrayList<>();

        for(int i=1; i<N; i++) {
            Random random = new Random();
            ArrayList<Integer> que1 = new ArrayList();

            for(int j=1; j<N; j++) {

                int rand = random.nextInt(N);

                    try {
                        int addToNewList = (ques.get(rand).get(0));
                        que1.add(addToNewList);
                        ques.get(rand).remove(0);
                    }
                        catch (IndexOutOfBoundsException e) {
                            j--;
                        }
            }
            ques1.add(que1);
        }
        N--;
        System.out.println(ques1);
        ques = ques1;
    }
}

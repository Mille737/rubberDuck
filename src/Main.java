import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Que queObject = new Que();
        queObject.createQues();
        queObject.onToNextQues();

        //for (ArrayList<Integer> que : queObject.ques) {
       //     System.out.println(que);
       // }



      /* System.out.println("Enter addDuck, to add your duck to the que.");
        System.out.println("Enter remove, to remove the first duck in que.");
        System.out.println("Enter print to see the que.");
        System.out.println("Enter quantity to see how many are in que.");
        System.out.println("Enter quit to exit.");
        while(!quit) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "addDuck":
                    addToQue();
                    System.out.println("Duck added.");
                    break;
                case "remove":
                    removeFromQue();
                    System.out.println("Duck removed.");
                    break;
                case "print":
                    System.out.println(que);
                    break;
                case "quantity":
                    System.out.println(que.size());
                    break;
                case "quit":
                    System.exit(1);
            }
        }*/
    }
}

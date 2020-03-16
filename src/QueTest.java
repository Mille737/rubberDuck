import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QueTest {
    Que que = new Que();

    @Test
    void createQues() {
        ArrayList<ArrayList<Integer>> testQue;

        for(int i=10; i>=1; i--) {
            testQue = que.createQues();
            assertEquals(i, testQue.size());
        }

    }
}

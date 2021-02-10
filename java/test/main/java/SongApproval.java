import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SongApproval {

    @Test
    public void testList() {
        String[] names = {"Llewellyn", "James", "Dan", "Jason", "Katrina"};
        Arrays.sort(names);
        Approvals.verifyAll("", names);
    }
}

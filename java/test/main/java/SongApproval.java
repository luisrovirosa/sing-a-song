import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class SongApproval {

    @Test
    public void verifyAllSongWithoutParameters() throws Exception {
        String text = tapSystemOut(() -> {
            Song.main(new String[]{});
        });

        Approvals.verify(text);
    }
}

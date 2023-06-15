import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnitTest {

    @Test
    public void shouldBeSuccessful() {
        assertThat(1 + 1).isEqualTo(2);
    }

    @Test
    public void shouldBeFailed() {
        assertThat(2 - 1).isEqualTo(2);
    }
}

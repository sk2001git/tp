package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class LinkedInTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new LinkedIn(null));
    }

    @Test
    public void equals() {
        LinkedIn linkedIn = new LinkedIn("alexyeoh");
        assertTrue(linkedIn.equals(new LinkedIn("alexyeoh")));

        assertTrue(linkedIn.equals(linkedIn));

        assertFalse(linkedIn.equals(5.0f));

        assertFalse(linkedIn.equals(new LinkedIn("zhiwang")));
    }
}

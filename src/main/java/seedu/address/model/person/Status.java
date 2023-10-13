package seedu.address.model.person;

import seedu.address.commons.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a Status in the Person class
 */
public class Status {
    public static final String MESSAGE_CONSTRAINTS = "Status should be either one of the following: 'Preliminary'," +
            "'Interviewed', 'Offered', 'Rejected'";
    private StatusTypes statusType;


    public Status() {
        this.statusType = StatusTypes.PRELIMINARY;
    }

    /*public StatusTypes getStatusType() {
        return this.statusType;
    }*/

    public void setStatusType(StatusTypes newStatus) {
        this.statusType = newStatus;
    }

    public static boolean isValidStatus(String status) {
        List<String> validStatus = Arrays.asList("Preliminary", "Interviewed", "Rejected", "Offered");
        return validStatus.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(status, keyword));


    }

    @Override
    public String toString() {
        return statusType.toString();
    }
}

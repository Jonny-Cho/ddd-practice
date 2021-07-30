package calculator;

import java.util.Arrays;
import org.springframework.util.StringUtils;

public class StringCalculator {

    private static final int ZERO = 0;

    public int calculate(final String stringNumber) {
        if (isBlank(stringNumber)) {
            return ZERO;
        }
        return calculate(Seperator.of(stringNumber));
    }

    private int calculate(final Seperator seperator) {
        return Arrays.stream(seperator.getTargetNumber()
            .split(seperator.getDelimiter()))
            .map(PositiveNumber::of)
            .reduce(PositiveNumber.of(ZERO), PositiveNumber::sum)
            .getValue();
    }

    private boolean isBlank(final String stringNumber) {
        return !StringUtils.hasText(stringNumber);
    }
}

package matchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class ContainsStringIgnoringCaseMatcher extends TypeSafeMatcher<String> {

    private String substring;

    public ContainsStringIgnoringCaseMatcher(String substring) {
        this.substring = substring;
    }

    @Override
    protected boolean matchesSafely(String string) {
        return string.toLowerCase().contains(substring.toLowerCase());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("string (ignore case)");
    }

    public static Matcher<String> containsStringIgnoringCase(String substring) {
        return new ContainsStringIgnoringCaseMatcher(substring);
    }
}
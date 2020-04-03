package matchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class ContainsStringIgnoringCase extends TypeSafeMatcher<String>{

   private String substring;

    public ContainsStringIgnoringCase(String substring) {
        super();
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
        return new ContainsStringIgnoringCase(substring);
    }
}
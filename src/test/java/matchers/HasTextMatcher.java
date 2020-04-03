package matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.containsString;

public class HasTextMatcher extends TypeSafeMatcher<WebElement> {

    private Matcher<String> textMatcher;

    private HasTextMatcher(Matcher<String> textMatcher) {
        this.textMatcher = textMatcher;
    }

    @Override
    protected boolean matchesSafely(WebElement webElement) {
        return textMatcher.matches(webElement.getText());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("webЕlement has text");
    }

    @Factory
    public static Matcher<WebElement> hasText(String s) {
        return new HasTextMatcher(containsString(s));
    }

    @Factory
    public static Matcher<WebElement> hasText(Matcher<String> s) {
        return new HasTextMatcher(s);
    }
}
package matchers;

import org.hamcrest.core.SubstringMatcher;

public class ContainsStringIgnoringCase extends SubstringMatcher {

    public ContainsStringIgnoringCase(String substring) {
        super(substring);
    }

    public static SubstringMatcher containsStringIgnoringCase(String substring) {
        return new ContainsStringIgnoringCase(substring);
    }

    @Override
    protected boolean evalSubstringOf(String s) {
        return s.toLowerCase().contains(substring.toLowerCase());
    }

    @Override
    protected String relationship() {
        return "containing (ignoring case)";
    }
}
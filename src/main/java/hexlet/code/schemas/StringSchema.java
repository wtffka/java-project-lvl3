package hexlet.code.schemas;

public class StringSchema extends BaseSchema {

    @Override
    public final StringSchema required() {
        isRequiredOn();
        addCheck(x -> {
            if (x instanceof String) {
                return !x.toString().isEmpty();
            }
            return false;
        });
        return this;
    }

    public final StringSchema contains(String subString) {
        addCheck(x -> x.toString().contains(subString));
        return this;
    }

    public final StringSchema minLength(int length) {
        addCheck(x -> x.toString().length() >= length);
        return this;
    }
}

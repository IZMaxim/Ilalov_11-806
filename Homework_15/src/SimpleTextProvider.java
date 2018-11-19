public class SimpleTextProvider implements ITextProvider {
    private String string;

    public SimpleTextProvider(String string) {
        this.string = string;
    }

    @Override
    public String getText() {
        return string;
    }
}
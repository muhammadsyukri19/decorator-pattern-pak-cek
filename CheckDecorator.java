import java.util.List;

public abstract class CheckDecorator implements PackageCheck {
    protected final PackageCheck wrappee;

    public CheckDecorator(PackageCheck wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public List<String> check(PackageData data) {
        return wrappee.check(data);
    }
}

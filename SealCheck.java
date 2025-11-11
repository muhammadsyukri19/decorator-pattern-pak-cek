import java.util.List;

public class SealCheck extends CheckDecorator {

    public SealCheck(PackageCheck wrappee) {
        super(wrappee);
    }

    @Override
    public List<String> check(PackageData pkg) {
        List<String> issues = super.check(pkg);

        System.out.println("[SealCheck] Mengecek segel paket...");

        if (!pkg.sealed) {
            issues.add("Segel paket tidak rapat.");
            System.out.println("  -> GAGAL: segel tidak rapat");
        } else {
            System.out.println("  -> LULUS");
        }

        return issues;
    }
}

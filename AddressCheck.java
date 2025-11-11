import java.util.List;

public class AddressCheck extends CheckDecorator {

    public AddressCheck(PackageCheck wrappee) {
        super(wrappee);
    }

    @Override
    public List<String> check(PackageData pkg) {
        List<String> issues = super.check(pkg);

        System.out.println("[AddressCheck] Mengecek alamat...");

        if (pkg.address == null || pkg.address.trim().isEmpty()) {
            issues.add("Alamat tujuan kosong.");
            System.out.println("  -> GAGAL: alamat kosong");
        } else if (pkg.address.length() < 10) {
            issues.add("Alamat terlalu singkat.");
            System.out.println("  -> GAGAL: alamat terlalu singkat");
        } else {
            System.out.println("  -> LULUS");
        }

        return issues;
    }
}

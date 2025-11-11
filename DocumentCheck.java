import java.util.List;

public class DocumentCheck extends CheckDecorator {

    public DocumentCheck(PackageCheck wrappee) {
        super(wrappee);
    }

    @Override
    public List<String> check(PackageData data) {

        System.out.println("[DocumentCheck] Mengecek packing list...");

        List<String> issues = super.check(data);

        if (!data.hasPackingList) {
            issues.add("Daftar barang (packing list) tidak terlampir.");
        }

        return issues;
    }
}

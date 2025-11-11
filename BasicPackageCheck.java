import java.util.ArrayList;
import java.util.List;

public class BasicPackageCheck implements PackageCheck {
    @Override
    public List<String> check(PackageData data) {
        System.out.println("[BasicCheck] Memulai pengecekan paket...");
        return new ArrayList<>();
    }
}

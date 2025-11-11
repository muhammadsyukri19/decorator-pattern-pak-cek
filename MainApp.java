import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        PackageData paket = new PackageData(
                "Rizki Maulana",
                "Jl. K.H. Ahmad No. 22, Banda Aceh",
                2.5,
                false,   // tidak ada packing list
                true     // segel ok
        );

        PackageCheck evaluator =
            new SealCheck(
                new DocumentCheck(
                    new AddressCheck(
                        new BasicPackageCheck()
                    )
                )
            );

        System.out.println("=== Sistem Evaluasi Kelengkapan Paket Pengiriman ===");
        System.out.println("Nama Penerima : " + paket.name);
        System.out.println("Alamat Tujuan : " + paket.address);
        System.out.println("Berat Paket   : " + paket.weight + " kg");
        System.out.println("--------------------------------------------");

        List<String> hasil = evaluator.check(paket);

        System.out.println("\nStatus Kelengkapan : " + (hasil.isEmpty() ? "✓ LENGKAP" : "✗ TIDAK LENGKAP"));

        if (!hasil.isEmpty()) {
            System.out.println("\nMasalah ditemukan:");
            for (String i : hasil) {
                System.out.println("- " + i);
            }
        }
    }
}

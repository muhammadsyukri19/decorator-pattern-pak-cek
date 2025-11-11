public class PackageData {
    public String name;
    public String address;
    public double weight;
    public boolean hasPackingList;
    public boolean sealed;

    public PackageData(String name, String address, double weight,
                       boolean hasPackingList, boolean sealed) {
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.hasPackingList = hasPackingList;
        this.sealed = sealed;
    }
}

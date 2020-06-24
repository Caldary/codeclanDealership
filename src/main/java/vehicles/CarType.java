package vehicles;

public enum CarType {
    PETROL("Petrol"),
    DIESEL("Diesel"),
    ETHONOL("Ethonol"),
    ELECTRIC("Electric"),
    DILITHIUM("Dilithium");

    private String nameType;

    CarType(String nameType) {
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }
}
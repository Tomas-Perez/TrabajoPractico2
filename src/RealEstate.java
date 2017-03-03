public class RealEstate {
    private int code,numberOfRooms,numberOfBathrooms;
    private String Type;
    private boolean hasGarage;

    public RealEstate(int code, int numberOfRooms, int numberOfBathrooms, String type, boolean hasGarage) {
        this.code = code;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        Type = type;
        this.hasGarage = hasGarage;
    }

    public int getCode() {
        return code;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public String getType() {
        return Type;
    }

    public boolean HasGarage() {
        return hasGarage;
    }
}

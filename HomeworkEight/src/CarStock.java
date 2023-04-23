import java.util.Objects;

public class CarStock {

    private String carName;

    private String carModel;

    private int yearOfBuild;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setYearOfBuild(int yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    public CarStock(String carName, String carModel, int yearOfBuild) {
        this.carName = carName;
        this.carModel = carModel;
        this.yearOfBuild = yearOfBuild;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarStock carStock = (CarStock) o;
        return yearOfBuild == carStock.yearOfBuild && Objects.equals(carName, carStock.carName) && Objects.equals(carModel, carStock.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carModel, yearOfBuild);
    }
    @Override
    public String toString() {
        return  carName + " " +
                carModel + " " +
                yearOfBuild;
    }
}

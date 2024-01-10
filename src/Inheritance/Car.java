package Inheritance;

public  class Car {
    private int carNO;
    private String carBrand;

    public Car(String carBrand, int carNo){
        this.carNO = carNo;
        this.carBrand = carBrand;
    }

    public int getCarNO() {
        return carNO;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarNO(int carNO) {
        this.carNO = carNO;
    }


    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


}

package Inheritance;

public class Honda extends Car{
    private String model;

    public Honda(String carBrand, int carNo){
        super(carBrand, carNo);
        model = "";
    }

    @Override
    public int getCarNO() {
        return super.getCarNO();
    }
}


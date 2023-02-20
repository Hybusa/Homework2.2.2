public class Truck extends Car {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkTrailer() {
        System.out.println(ConsoleColors.GREEN + "Проверяем прицеп" + ConsoleColors.RESET);
    }

    @Override
    public void service() {
        super.service();
        this.checkTrailer();
    }
}

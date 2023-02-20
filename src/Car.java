public class Car extends Vehicle{

    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println(ConsoleColors.CYAN + "Проверяем двигатель" + ConsoleColors.RESET);
    }

    public void service(){
        super.service();
        this.checkEngine();
    }
}

public abstract class Vehicle implements Service {
    private final String modelName;
    private int wheelCount;

    public Vehicle(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void updateTyre() {
        System.out.println(ConsoleColors.BLUE + "Меняем покрышку" + ConsoleColors.RESET);
    }

    public void service() {
        System.out.println("Обслуживаем " + ConsoleColors.PURPLE_UNDERLINED
                + this.getModelName() + ConsoleColors.RESET);
        for (int i = 0; i < this.getWheelCount(); i++) {
            this.updateTyre();
        }
    }

}

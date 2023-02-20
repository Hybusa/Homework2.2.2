public class ServiceStation {
    public static void check(Vehicle vehicle) {
        vehicle.service();
        System.out.println();
    }

    //Overload
    public static void check(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            v.service();
            System.out.println();
        }
    }
}


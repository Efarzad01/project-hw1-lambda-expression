package src.lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("Ram Size of the Laptop is "+memorySize+" GB");
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("Monitor Size of the Laptop is "+screenSize+ " inch");
            }
        };

        laptop.monitorSize(16);
        laptop.monitorSize(15);

        //please implement anonymous function for Phone FunctionalInterface

        //x -> {} #Lamda

        Phone phone = x ->
                System.out.println("Cellular Network of the phone is "+ x);
        phone.cellularNetwork("AT&T");


    }
}

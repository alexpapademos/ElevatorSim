public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Elevator elevator1 = new Elevator(5);
        System.out.println(elevator1.getCurLevel());
        elevator1.callFrom(2);
        elevator1.goTo(6);
        elevator1.goTo(4);
        elevator1.callFrom(4);

        System.out.println();
        Elevator ele2 = new Elevator(-1,4);
        ele2.callFrom(3);
        ele2.goTo(-1);
    }
}
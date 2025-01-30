public class Client {
    public static void main(String[] args) {
        M a = new M();   // counte = 100
        M b = new M();   // counte = 0
        M c = new M();   // counte = 0
        a.count = 100;
        b.count = 250;
        c.count = 500;

        a.deposit(20);
        a.deposit(40);
        b.deposit(30);
        c.deposit(25);
        System.out.println(a.count); // 160
        System.out.println(b.count); // 280
        System.out.println(c.count); // 525
    }
}

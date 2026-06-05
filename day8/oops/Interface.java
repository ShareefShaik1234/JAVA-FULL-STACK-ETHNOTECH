package day8.oops;

interface MyRuleBook {

    void time();
    void friends();
    void study();
}

class MyChildren implements MyRuleBook {

    @Override
    public void time() {
        System.out.println("Wake up at 6 AM");
    }

    @Override
    public void friends() {
        System.out.println("Spend time with good friends");
    }

    @Override
    public void study() {
        System.out.println("Study daily for 2 hours");
    }
}

public class Interface {

    public static void main(String[] args) {

        MyChildren obj = new MyChildren();

        obj.time();
        obj.friends();
        obj.study();
    }
}
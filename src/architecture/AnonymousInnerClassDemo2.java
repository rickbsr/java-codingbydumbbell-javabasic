package architecture;

public class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {
        new AnonymousInnerClassDemo2().doFoo().foo();
    }

    public MyInterFace doFoo() {
        return new MyInterFace() {
            public void foo() {
                System.out.println("Foo");
            }
        };
    }
}

interface MyInterFace {
    void foo();
}

package architecture;

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {
        new ISample() {
            @Override
            public void fooInterface() {
                System.out.println("Override fooInterface");
            }
        }.fooInterface();

        new Sample(){
            @Override
            void fooClass() {
                System.out.println("Override fooClass");
            }
        }.fooClass();

        new ASample(){
            @Override
            void fooAbstract() {
                System.out.println("Override fooAbstract");
            }
        }.fooAbstract();
    }
}

interface ISample {
    void fooInterface();
}

class Sample {
    void fooClass() {
    }
}

abstract class ASample {
    abstract void fooAbstract();
}
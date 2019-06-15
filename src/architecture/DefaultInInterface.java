package architecture;

public class DefaultInInterface {

}

class ResultA implements IA {
    public static void main(String[] args) {
        new ResultA().foo(); // interface IA
    }
}

class ResultB implements IA, IB {
    @Override
    public void foo() {
        // 需要自行覆寫方法，否則會出現編譯錯誤。
    }
}

class ResultC implements IC {
    public static void main(String[] args) {
        IC.foo();
    }
}

class ResultD implements IA, IC {
    public static void main(String[] args) {
        new ResultD().foo(); // interface IA
        new ResultD().test(); // interface IA
        IC.foo(); // 明確指定
    }

    private void test() {
        foo();
    }
}

class ResultE implements IA, IB, IC {
    public static void main(String[] args) {
        new ResultE().foo(); // 需要自行覆寫方法，否則會出現編譯錯誤。
        IC.foo(); // 明確指定
    }

    @Override
    public void foo() {
        System.out.println("Result E");
    }
}

class ResultF extends CA implements IA, IB {
    public static void main(String[] args) {
        new ResultF().foo(); // class CA
        new ResultF().superFoo(); // class CA
    }

    private void superFoo() {
        super.foo();
    }
}

interface IA {
    default void foo() {
        System.out.println("interface IA");
    }
}

interface IB {
    default void foo() {
        System.out.println("interface IB");
    }
}

interface IC {
    static void foo() {
        System.out.println("interface IC");
    }
}

class CA {
    public void foo() { // 別忘了 public，不然那就是老錯誤了
        System.out.println("class CA");
    }
}

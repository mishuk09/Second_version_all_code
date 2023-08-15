class NumberManipulator {
    public void swap(IntWrapper x, IntWrapper y) {
        int temp = x.value; // save the value of x
        x.value = y.value; // put y's value into x
        y.value = temp; // put temp into y
    }
}

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class swap {
    public static void main(String[] args) {
        NumberManipulator n = new NumberManipulator();

        IntWrapper a = new IntWrapper(100);
        IntWrapper b = new IntWrapper(200);

        System.out.println("Before swap, value of a: " + a.value);
        System.out.println("Before swap, value of b: " + b.value);

        n.swap(a, b);

        System.out.println("After swap, value of a: " + a.value);
        System.out.println("After swap, value of b: " + b.value);
    }
}

package egoing.advanced.progenitor;

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }

    @Override
    public String toString() {
        return super.toString() + " left: " + this.left + ", right: " + this.right;
    }

}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        System.out.println(c1);
        System.out.println(c1.toString());
    }
}

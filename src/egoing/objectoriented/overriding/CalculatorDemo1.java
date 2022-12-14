package egoing.objectoriented.overriding;

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    @Override
    public void sum() {
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }

    @Override
    public int avg() {
        return super.avg();
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

        Calculator c2 = new Calculator();
        c2.setOperands(10, 20);
        c2.sum();
        c2.avg();

    }
}

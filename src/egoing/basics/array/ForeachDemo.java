package egoing.basics.array;

public class ForeachDemo {
    public static void main(String[] args) {
        String[] members = {"최진혁", "최유빈", "한이람"};

        for (String mem: members) {
            System.out.println(mem + "이 상담을 받았습니다.");
        }
    }
}
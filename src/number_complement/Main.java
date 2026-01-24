package number_complement;

public class Main {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(4));
        System.out.println(findComplement(0));
    }

    public static int findComplement(Integer num) {

        return num^1;
    }
}

// 101
// 001
// 010
//111
//010, 011

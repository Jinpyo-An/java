package inflearn_java_middle.collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        System.out.println();
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        System.out.println();
        System.out.println("hasIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hasIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hasIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }

        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

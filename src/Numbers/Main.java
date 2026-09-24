package Numbers;

public class Main {
    public static void main(String[] args) {
       int[] numbers =  new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
       StringBuilder str = new StringBuilder();
        for(int val: numbers)
            str.append(String.valueOf(val));
         str.insert(0,"(");
         str.insert(4,") ");
         str.insert(9,"-");
        str.toString();

    }
}

package binary;

public class Main {
    public static void main(String[] args) {
        int n = 1236;
        long newDigital = 0L;
        int zeroCount = 0;

        while(n > 0){
            if(n % 2 != 0)
                newDigital += Math.pow(10, zeroCount);
            n /= 2;
            zeroCount++;
        }

        System.out.println(newDigital);
        System.out.println(countBits(1));
    }


    static int count = 0;

    public static long countBits(int n){

        if(n % 2 != 0)
            count++;

        if(n <= 1)
            return count;

        return countBits(n/2);

    }

    void funck(){
        int n =1;
        int zeroCount = 0;

        while(n > 0){
              zeroCount += n & 1;
              n /= 2;
        }
    }


}

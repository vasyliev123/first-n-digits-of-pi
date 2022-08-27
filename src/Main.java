public class Main {
    public static void main(String[] args) {
        //pi = sqrt(2(1-cos(90/2^N)))*2*2^N

        long N = 1;
        double n=1;
        double pi =0;
//        while(N<100) {
//            pi = Math.sqrt(2*(1-Math.cos(1.5707963268/Math.pow(2,N))))*2*Math.pow(2,N);
//            System.out.println(pi);
//            N++;
//        }

//        while(N<1000000000)
//        {
//
//            if(N%2==0)
//                pi = pi -(4/n);
//            else
//                pi = pi +(4/n);
//            n=n+2;
//            N++;
//        }

        System.out.println(pi);
    }
}

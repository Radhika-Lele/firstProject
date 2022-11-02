public class Loops {
    public static void main(String[] args) {


        for (int i = 1; i <= 5 ; i++) {       //this is outer room rows, i is rows, i.e print 4 rows

            for (int j = 1; j <= i; j++) {       // this is inner room, j refer as column , i.e print task 3 times, break main task in 3 parts
                System.out.print(j+" ");
            }
            System.out.println();
            System.out.println("bapu");
        }


    }
}
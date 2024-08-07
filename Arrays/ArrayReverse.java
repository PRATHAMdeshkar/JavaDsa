// Array Reverse Using an Extra Array (Non In-place):

public class ArrayReverse {
    public static void main(String[] args) {
        int oa[] ={1,2,3,4,5};

        int ra[]= new int[oa.length];

        for(int i=0; i< oa.length; i++){
            ra[i]= oa[oa.length-1-i];
        }
        
        for(int i=0; i<oa.length; i++){
            System.out.println(oa[i]);
        }

        System.out.println("reversed arry:");
        for(int i=0; i< ra.length; i++){
            System.out.print(ra[i]);
        }
    }

}

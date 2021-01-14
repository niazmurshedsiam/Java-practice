
package foreasyloopnumber;


public class Foreasyloopnumber {

    public static void main(String[] args) {
        int num[] ={10,12,33,55,34,66,77,88,99};
        int sum =0;
        for(int x : num)
            
        {
            sum = sum+x;
            System.out.println(x);
        }
        System.out.println(sum);
    }
    
}

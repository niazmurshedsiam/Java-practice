
package addingarray;

public class AddingArray {

    public static void main(String[] args) {
        String First_name = "Niaz Murshed";
        String Second_name = " Siam";
        //String Full_name = First_name+Second_name;
        //System.out.println("Fullname is = "+Full_name);
       String Full_name = First_name.concat(Second_name);
        System.out.println(Full_name);
        String uppername = Full_name.toUpperCase();
        System.out.println(uppername);
        String lowername = Full_name.toLowerCase();
        System.out.println(lowername);
        boolean b = First_name.startsWith("Nia");
        System.out.println("B is = "+b);
        boolean l = Second_name.endsWith("am");
        System.out.println("L is = "+l);
        String[] name ={"Siam","Niaz","Sadnan"};
        for(String x : name)
        {
            System.out.println(x);
        }
    }
    
}

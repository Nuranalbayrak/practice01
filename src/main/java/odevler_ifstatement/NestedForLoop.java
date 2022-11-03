package odevler_ifstatement;

public class NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizin.
        *
        **
        ***
        ****
         */
        int satir=4;
        for (int i=1;i<=satir;i++){
            String c="";
            for (int k=1;k<=i;k++){
                c=c+"*";
            }
            System.out.println(c);
        }






    }
}

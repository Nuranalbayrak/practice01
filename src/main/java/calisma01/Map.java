package calisma01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map {
    //Example 1: verilen mapte istenen programlama dilioni bilen kisileri liost olarak donduren bir method yazin
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(101,"Ali,Can, java");
        map1.put(102,"Veli, yan , java");
        map1.put(103,"Ali,Yan, c#");
        System.out.println(map1);

        String istenenDil="JAVA";

       List<String>m=javaBilenler(map1,istenenDil);
        System.out.println(m);





    }
    private static List<String> javaBilenler(HashMap<Integer,String> map1,String istenenDil){

        List<String> isimListesi = new ArrayList<>();
        System.out.println(isimListesi);

        for (String each: map1.values()) {
            String arr[]= each.split(",");
            if (arr[2].equalsIgnoreCase(istenenDil)){
                isimListesi.add(arr[0]);
            }
        }
        return isimListesi;
    }
}

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int a = 12;
        // System.out.println(a.toString());

        String str = Integer.toString(a);
        System.out.println(str + 1);
        String str2 = "12";
        System.out.println("Одинаковые строки: " + str.equals(str2));

        if (str.equals(str2)) {
            System.out.println("Строки равны");
        }

        String str1 = "100";
        int x = Integer.parseInt(str1);
        int b = x + 100;
        if (b == 200) {
            System.out.println("b является числом со значением 200");
        }
        ArrayList<String>dinamicArray=new ArrayList<String>();
        dinamicArray.add("A");
        dinamicArray.add("B");
        dinamicArray.add("C");
        ArrayList<String>dinamicArray2=new ArrayList<String>();
        System.out.println(dinamicArray.get(0));




    }

}

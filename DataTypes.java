public class DataTypes
{
    public static void main(String[] args)
    {
        System.out.println("DataTypes");
        int i; 
        float f = 2.5f;
        boolean flag = true;
        i = 10;
        f+=i;
        flag = !flag;
        i++;
        System.out.println(i);
        System.out.println(f);
        System.out.print(flag);
        String string1 = "I am a string";
        String string2 = "string2";
        string1.equals(string2);
        String string3 = "I am also a string";
        string1.compareTo(string3);
        boolean stringsEqual = string1.equals(string3);
    }
}
package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String name ="Anuj";

                int length = name.length();
        String rev="";
        for (int i=length -1; i>=0; i--)
        {
            rev =rev + name.charAt(i);
        }
        System.out.println("reverse of "+name+" is "+rev);

}
}

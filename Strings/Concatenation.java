public class Concatenation {
    public static void main(String[] args) {
        String fname="Arman";
        String sname="Khan";
        String fullname=fname+ " " +sname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}

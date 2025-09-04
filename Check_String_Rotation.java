import java.util.*;
class Main {
    public static Boolean ss(String s1, String s2){
        String s3 = s1+s1;
        if(s3.contains(s2)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(ss(s1,s2));
    }
}

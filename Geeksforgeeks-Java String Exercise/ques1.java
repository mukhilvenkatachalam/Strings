import java.util.*;
class ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        ArrayList<String> al = new ArrayList<>();
        for(String s1 : str){
            if(s1.length()%2==0)
                al.add(s1);
        }
        String result = String.join(" ",al);
        System.out.println(result);
    }
}

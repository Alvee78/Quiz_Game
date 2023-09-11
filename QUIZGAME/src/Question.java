import java.util.Scanner;

public class Question
{
    public static void main(String[] args)
    {
        System.out.println("Give answer choosing a/b/c/d");
        Scanner sc= new Scanner(System.in);
        String [] str =new String[10];
        //String str;
        System.out.println("What is the capital of Bangladesh? \na,Dhaka\nb.Rajshahi\nc.Rangpur\nd.Dinajpur");
        str[0]=sc.nextLine();
        System.out.println("2+2*2=?\na.2\nb.4\nc.6\nd.8");
        str[1]=sc.nextLine();
        System.out.println("Where is Rajshahi University ?\na,Dhaka\nb.Rajshai\nc,Dinajpur\nd.Comilla");
         str[2]=sc.nextLine();
        System.out.println("which is a vowel?\na.a\nb.b\nc.c\nd.d");
        str[3]=sc.nextLine();
        System.out.println("I eat rice. Here rice is a \na.Verb\nb.Noun\nc.Adjective\nd.Dinajpur");
        str[4]=sc.nextLine();
        System.out.println("(2+2)*2=?\na.2\nb.4\nc.6\nd.8");
        str[5]=sc.next();
        Solution sol = new Solution();
        sol.Solve(str);

    }
}

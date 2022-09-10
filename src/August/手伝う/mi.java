package August.手伝う;
import java.util.Scanner;


public class mi
{
    public static void main(String args[]){
        int m;
        double sum,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String [] strings = s.trim().split(" ");
            double input[] = new double[strings.length];
            for (int i = 0; i < strings.length; i++){
                input[i] = Double.parseDouble(strings[i]);
            }
            sum=0;

            for(int i=0;i<input[strings.length - 1];i++){
                sum=sum+input[0];
                input[0]=Math.sqrt(input[0]);
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }
}
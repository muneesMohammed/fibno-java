import java.util.Scanner;

public class fibno {
    public static void main(String[] args) {
        int firstTerm=0,secondTerm=1,temp,range,i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter range");
         range=in.nextInt();

        for (i=2;i<range;i++){
            System.out.print(firstTerm+" ");//printing 0 and 1
            temp=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=temp;

        }

    }
}

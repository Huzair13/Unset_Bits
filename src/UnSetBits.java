import java.util.Scanner;

public class UnSetBits {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number !!! ");
        int number=scanner.nextInt();

        System.out.println("Enter the Bit Position !!! ");
        int position=scanner.nextInt();

        int result=UnsetBits(number,position);
        System.out.println(result);
    }

    private static int UnsetBits(int number, int position) {

        if(checkBit(number,position)){
            number=number^(1<<position);
        }
        return number;
    }

    private static boolean checkBit(int number, int position) {
        if((number&(1<<position))==0){
            return false;
        }
        return true;
    }
}
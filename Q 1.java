import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);


        int n=sc.nextInt();
        String arr[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='+'){
                    count++;
                    break;
                }else if(arr[i].charAt(j)=='-'){
                    count--;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}
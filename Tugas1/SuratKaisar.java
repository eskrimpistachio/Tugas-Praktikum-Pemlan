import java.io.*;
import java.util.*;

public class SuratKaisar {
    static void pergeseran(int geser, String kalimat) {

        for(int i = 0 ; i < kalimat.length() ; i++){

            if (kalimat.charAt(i) == ' '){
                System.out.print(' ');
            }

            if (kalimat.charAt(i) >= 65 && kalimat.charAt(i) <=90 ){

                if (kalimat.charAt(i) + geser > 90){
                    int value = ((int)kalimat.charAt(i) ) - 26 + geser ;
                    System.out.print((char)(value));
                }

                else{
                    int value = ((int)kalimat.charAt(i) ) + geser ;
                    System.out.print((char)(value));
                }

            }
            if (kalimat.charAt(i) >= 97 && kalimat.charAt(i) <=122){

                if (kalimat.charAt(i) + geser > 122){
                    int value = ((int)kalimat.charAt(i) ) - 26 + geser ;
                    System.out.print((char)(value));
                }
                else{
                    int value = ((int)kalimat.charAt(i) ) + geser ;
                    System.out.print((char)(value));
                }

            }


        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        int geser = input.nextInt();

        pergeseran(geser,kalimat);
    }
}

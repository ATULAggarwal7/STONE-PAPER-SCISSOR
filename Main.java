
import java .util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n0. of rounds you want to play");
        int n= sc.nextInt();
        int i=0;
        int you=0;
        int comp=0;
        do {

            int r = (int) (Math.random() * 3);
            System.out.println("Choose 1");
            System.out.println("0 for STONE");
            System.out.println("1 for PAPER");
            System.out.println("2 for SCISSOR");

            int c = sc.nextInt();
            if (c > 3) {
                System.out.println("wrong input");
            }
            System.out.println(r);
            if (r == 0 && c == 0) {
                System.out.println("DRAW");
            } else if (r == 0 && c == 1) {
                System.out.println("YOU won");
            } else if (r == 0 && c == 2) {
                System.out.println("COMP WON");
            } else if (r == 1 && c == 0) {
                System.out.println("COMP WON");
            } else if (r == 1 && c == 1) {
                System.out.println("DRAW");
            } else if (r == 1 && c == 2) {
                System.out.println("YOU WON");
            } else if (r == 2 && c == 0) {
                System.out.println("YOU WON");
            } else if (r == 2 && c == 1) {
                System.out.println("COMP WON");
            } else if (r == 2 && c == 2) {
                System.out.println("DRAW");
            }

            if(r == 0 && c == 2||r == 1 && c == 0||r == 2 && c == 1){
                comp++;
            } else if (r == 0 && c == 1||r == 1 && c == 2||r == 2 && c == 0) {
                you++;
            }else {
                comp++;
                you++;
            }


            i++;
        }while (i<n);
        if(comp>you){
            System.out.println("COMP WON THE GAME");
        } else if (you>comp) {
            System.out.println("YOU WON THW GAME");
        }else {
            System.out.println("GAME DRAWN");
        }


    }
}


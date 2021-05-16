package study.java.scope;

import java.util.Scanner;

public class X {
    public Scanner scanner = new Scanner(System.in);
    int x;

    public X(int x){
        this.x = x;
    }

    public void x(){
        System.out.println("In x method of class X"+x);
    }

    public void printTable(int x){
        for(int i=1; i <= 10; i++ ){
            System.out.println(i + " times "+x+"="+(i * x) );
        }
    }

    public class Xinnercalss{
        int x;
        public Xinnercalss(int x){
            this.x = x;
        }

        public void x(){
            System.out.println("In x method of class X"+x);
        }

        public void printTable(int x){
            for(int i=1; i <= 10; i++ ){
                System.out.println(i + " times "+x+"="+(i * x) );
            }
        }
    }
}

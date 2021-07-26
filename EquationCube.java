package com.company;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        MATHMethod a = new MATHMethod(A, B, C, D);
        a.Discriminant();
    }
}

class MATHMethod {
    private int A, B, C, D;
    public MATHMethod(int A, int B, int C, int D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    public void Discriminant() {
        for (int x = -100; x<=100;x++){
            double result = this.A * Math.pow(x, 3) + this.B*x *x + this.C*x+this.D;
            if (result == 0){
                System.out.println("X = "+x);
            }
        }
    }
}

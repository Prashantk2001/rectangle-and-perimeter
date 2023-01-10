package rectangle_Areaand_perimeter;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        int area,peri,l,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any length and width of rectangle ");
        l = sc.nextInt();
        w = sc.nextInt();
        area = 1*w;
        peri = 2*(1+w);
        System.out.println("area of rectangle = " + area);
        System.out.println("peri of rectangle = " + peri);
    }
}

package rectangle_Areaand_perimeter;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int area,peri,l,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle");
        l= sc.nextInt();
        w= sc.nextInt();
        area = l *w;
        peri = 2 * (l + w);
        System.out.println("Area of Rectangle = " + area);
        System.out.println("prime of Rectangle = " + peri);

    }
}

package rectangle_Areaand_perimeter;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        int area,peri,l,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any length and width");
        l = sc.nextInt();
        w = sc.nextInt();
        area = l*w;
        peri = 2*(l+w);
        System.out.println("area of rectanglle = " + area);
        System.out.println("peri of rectangle = "+ peri);
    }
}

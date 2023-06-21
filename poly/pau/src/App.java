import java.util.Scanner;
class Polygon{
    int numo;
    int numt;
}
class Square extends Polygon{
    public void render(){
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter the first number: ");
        int numo = input.nextInt();

        System.out.println("Enter the second number: ");
        int numt = input.nextInt();

        System.out.println("The sum of your two numbers are: " + (numo + numt));
    }
}
class Circle extends Square{
    public void render() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first grade: ");
        int gro = input.nextInt();
        System.out.println("Enter your second grade: ");
        int grt = input.nextInt();

        System.out.println("The average of your grades is: " + (gro + grt)/2);
    }
}
public class App {
    public static void main(String[] args) {
        Square s = new Square();
        s.render();

        Circle c = new Circle();
        c.render(); 
    }
}

import java.util.Random;

class RandomNumber extends Thread
{
    int n;
    Random r=new Random();
    public void run()
    {
        n=r.nextInt(100);
        System.out.println("Random: "+n);
        try
        {
            Thread.sleep(100000);
        }catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}

class Square extends Thread
{
    double n;
    Square(int num)
    {
        this.n=num;
    }
    public void run()
    {
        n=Math.pow(n, 2);
        System.out.println("Square: "+n);
    }

}

class Cube extends Thread
{
    double n;
    Cube(int num)
    {
        this.n=num;
    }
    public void run()
    {
        n=Math.pow(n, 3);
        System.out.println("Cube"+n);
    }
}

public class MultiThread
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            Thread t1 = new RandomNumber();
            t1.start();
            Thread t2 = new Square(i);
            t2.start();
            Thread t3 = new Cube(i);
            t3.start();
        }
    }
}

/*
OUTPUT:

Random: 44
Random: 9
Random: 12
Random: 47
Random: 29
Random: 53
Random: 92
Random: 34
Random: 55
Random: 50
Square: 49.0
Square: 16.0
Square: 81.0
Square: 36.0
Square: 9.0
Cube216.0
Cube64.0
Cube8.0
Cube729.0
Square: 100.0
Cube512.0
Cube27.0
Square: 64.0
Square: 25.0
Square: 1.0
Cube1.0
Cube1000.0
Cube343.0
Cube125.0
Square: 4.0
 */
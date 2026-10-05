package Revision;

class Complex {
    int real;
    int imag;

    Complex(int r,int i){
        real=r;
        imag=i;
    }
    void display(){
        System.out.println(real+ "+" + imag+ "i");
    }
}
public class Practices{
    public static void main(String[] args) {  
    Complex c1=new Complex(3, 04);
    Complex c2=new Complex(2, 05);

    int realSum=c1.real+c2.real;
    int imagSum=c1.imag+c2.imag;

    System.out.println("first complex number");
    c1.display();

    System.out.println("second complex number");
    c2.display();

    System.out.println("Addition");
    System.out.println(realSum + "+" + imagSum +"i");
}}
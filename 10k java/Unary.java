public class Unary{
public static void main(String[] args){
int a=35;
int b=45;
System.out.println(a++ + b + ++a + ++b + ++a + b++);
System.out.println(++b + b - a++ - b++ + a++ - a++);
System.out.println(a++ + b++ + ++a - b-- - b -a);
System.out.println(a);
System.out.println(b);
}
}
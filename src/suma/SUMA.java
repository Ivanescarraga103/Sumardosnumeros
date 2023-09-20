
package suma;
import java.util.Scanner;
public class SUMA {
public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      float nn,nn4,p;
      System.out.print("Ingresa el primer numero");
      nn=leer.nextFloat();
      System.out.print("Ingresa el segundo numero");
      nn4=leer.nextFloat();
      p=nn+nn4;
      System.out.print("La suma es"+p);
    }
    
}

package NumerosMedia;import java.util.ArrayList;import java.util.Scanner;public class NumerosMedia {        public static void main (String []args){        Scanner leer = new Scanner(System.in);        ArrayList<Integer>numeros = new ArrayList <>();        boolean h = true;        int K, suma =0, media;        while (h){            System.out.println("Ingrese el numero");            K = leer.nextInt();            if (K==-99){                h= false;                break;            }else{                numeros.add(K);                suma +=K;            }        }        System.out.println(numeros);        System.out.println("LA SUMA:"+ suma);        media= suma/numeros.size();        System.out.println("LA MEDIA "+media);        int i=0;        for (Integer num : numeros)            if(num<media){                i++;                System.out.println(num+"^");            }else{                System.out.println(num);            }        System.out.println("# mayores a media: "+i);                  }        }
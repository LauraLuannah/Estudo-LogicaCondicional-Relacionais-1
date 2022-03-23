public class Relacionais {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));//false pq não é igual i1=10 i2=20
        System.out.println("i1 != i2 " + (i1 != i2));//true pq é diferente
        System.out.println("i1 > i2 " + (i1 > i2));//false pq é menor
        System.out.println("i1 <= i2 " + (i1 <= i2));//true pq é menor/igual

        System.out.println("f1 == f2 " + (f1 == f2));//false pq não é igual f1=4.5f  f2=3.5f
        System.out.println("f1 != f2 " + (f1 != f2));//true  pq é diferente
        System.out.println("f1 >= f2 " + (f1 >= f2));//true pq é maior/igual
        System.out.println("f1 < f2 " + (f1 < f2));//false pq é menor

        System.out.println("c1 == c2 " + (c1 == c2));// false c1=x=120 c2=y=121 (decimal)
        System.out.println("c1 != c2 " + (c1 != c2));//true pq é diferente
        System.out.println("c1 > c2 " + (c1 > c2));//false pq é menor
        System.out.println("c1 <= c2 " + (c1 <= c2));//true pq é menor/igual

        //OBS: TOMAR MUITO CUIDADO PARA UDAR IGUALDADE E DIFERENÇA EM CLASSES E OBJETOS. EX:STRING
        System.out.println("s1 == s2 " + (s1 == s2));//true pq é igual s1 = Fulano; s2 = Fulano String s3 = Cicrano
        System.out.println("s1 == s3 " + (s1 == s3));//false pq é diferente
        System.out.println("s1 != s2 " + (s1 != s2));//false pq é igual

        //System.out.println(s1 >= s2); missão não aplicável
        System.out.println(s1.length() >= s2.length());// true pq é igual
        //(length  mostra o tamanho da String, numero de caracteres(letras)

        //System.out.println(s1 < s2);  missão não aplicável


        System.out.println("b1 == b2 " + (b1 == b2));// false pq é diferente b1= true; b2= false
        System.out.println("b1 != b2 " + (b1 != b2));// true pq é diferente
        //System.out.println(b1 > b2); missão não aplicável
        //System.out.println(b1 <= i1); missão não aplicável

        System.out.println("i2 > f1 " + (i2 > f1));//true pq é maior   i2 = 20; f1 = 4.5f
        System.out.println("d1 == h1 " + (d1 == h1));//false pq é diferente d1 = 59.6d; h1 = 25
        //System.out.println(s2 != c1); missão não aplicável s2 = Fulano; c1 = 'x'
        //System.out.println(s3 != i1); missão não aplicável s3 = Cicrano;i1 = 10

        System.out.println("l1 == i2 " + (l1 == i2));//false pq é diferente l1 = 1597L;  i2 = 20
        System.out.println("l2 >= i1 " + (l2 >= i1));// true pq é maiorl2 = 8997L i1 = 10
        System.out.println("y1 != h1 " + (y1 != h1));// true pq é diferente y1 = 1; h1 = 25;


    }
}

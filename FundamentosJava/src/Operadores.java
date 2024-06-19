public class Operadores{
    
    public static void main (String args[]){

        //OPERADORES ARITMETICOS

        int a = 3, b=2;

        var resultado = a + b;
        System.out.println("La suma es: "+resultado);

        resultado = a - b;
        System.out.println("La resta es: "+resultado);

        resultado = a*b;
        System.out.println("La multiplicacione es: "+resultado);

        resultado = a/b;
        System.out.println("La division es: "+resultado);

        resultado = a%b;
        System.out.println("El residuo de la division es: "+resultado);


        if(a%2 ==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }



    }
}

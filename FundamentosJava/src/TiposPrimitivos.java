public class TiposPrimitivos {
    public static void main(String args[]){

        /*
         tipos primitivos enteros: byte, short, int, long
         */

         byte numeroByte =10;
         System.out.println(numeroByte);

         short numeroShort = 10;
         System.out.println("Numero Short: "+ numeroShort);
         System.out.println("Valor minimo Short: "+ Short.MIN_VALUE);
         System.out.println("Valor maximo Short: "+ Short.MAX_VALUE);

         short numeroInt = 10;
         System.out.println("Numero Short: "+ numeroInt);
         System.out.println("Valor minimo Short: "+ Integer.MIN_VALUE);
         System.out.println("Valor maximo Short: "+ Integer.MAX_VALUE);

         short numeroLong = 10;
         System.out.println("Numero Short: "+ numeroLong);
         System.out.println("Valor minimo Short: "+ Long.MIN_VALUE);
         System.out.println("Valor maximo Short: "+ Long.MAX_VALUE);

        /*
         Tipos prmitivos de tipo flotante: float, double
         */

        float numeroFloat = (float)10.0;
        System.out.println(numeroFloat);    
        
        double numeroDouble = 10;
        System.out.println("Numero double: "+ numeroDouble);
        System.out.println("Valor maximo double: "+ Double.MAX_VALUE);
        System.out.println("Valor maximo double: "+ Double.MIN_VALUE);


        /* Inferencia de tipos */

        var numeroEntero = 10;
        System.out.println("NumeroEntero = "+numeroEntero);

        //Tipos primitivos tipo char

        char miCaracter = 'a';
        System.out.println("caracter = "+miCaracter);

        //0021 = !
        char varChar = '\u0021';  // se usa backslashu para indicar que se va a usar unicode
        System.out.println("Variable unicode: "+varChar);
        
        // char en codigo decimal
        char varCharDecimal = 33;
        System.out.println("varchardecimal: "+varCharDecimal);






    }
}

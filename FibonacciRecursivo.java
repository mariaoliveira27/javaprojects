public class FibonacciRecursivo{
    public static void main(String[] args){
        int n = 54;
        System.out.println("Fibonacci de " + n + " = " + fibonacciRecursivo(n));
    }
    public static int fibonacciRecursivo(int n){
        if(n == 0 || n == 1){
            return n;
        }
      //  if(array)
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);  
        //return (n == 0 || n == 1) ? n : fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
// ? o operador ternário é uma forma de simplificar a estrutura condicional if-else
//: é o separador entre a condição e o valor a ser retornado caso a condição seja verdadeira
                                      
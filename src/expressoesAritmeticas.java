public class expressoesAritmeticas {
   public static void main(String[] args) {
    //Adição
    int a = 10;
    int b = 25; 
    int sum = a + b;

    System.out.println("Soma: " + sum); 

    //Subratração
    int c = 105;
    int d = 55;
    int sub = c - d;

    System.out.println("Sob:" + sub);

   // Concatenando strings com (+)
    String hello = "Olá";
    String world = "Mundo!";
    String sauldacao = hello + " " + world;
    
    System.out.println(sauldacao);


    //Multiplicação
    int e = 20;
    int f = 5;
    int mult = e * f;

    System.out.println("Mult:" + mult);

    //Divisão
    int g = 50;
    int h = 2;
    int div = g /h;
    System.out.println("Div: " + div);

    //Módulo
    int i = 100;
    int j = 4;
    int mod = i % j;
    System.out.println("Mod: " + mod);


    //Ordem de precedencia:
    // 1. Parênteses ().
    // 2. Multiplicação (*), divisão (/). Módula (%).
    // 3. Adição (+), Subtração (-).

    //Uso combinado do Operadores:
    int l = 10;
    int m = 5;
    int n = 2;
    int result = (l + m) * n - (l / m) % c; 
    System.out.println("resultado: " + result);

    }
}
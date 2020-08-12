public class CastDemo {
    public static void main(String[] args) {
        double x, y, d;
        long l;
        byte b;
        int i;
        char ch;

        l = 100123285L;
        d = l; // conversão automática de long para double

        d = 100123285.0;
        l = (long) d;


        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // converte double em int, trunca casas decimais
        System.out.println(i);

        i = 100;
        b = (byte) i; // Um byte pode conter o valor 100
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // Um byte não pode conter o valor 257
        System.out.println("Value of b: " + b);

        b = 88; // ASCII para X
        ch = (char) b; // Cast entre tipos incompatíveis
        System.out.println("ch: " + ch);
    }
}

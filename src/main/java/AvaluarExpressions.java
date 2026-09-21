// Activitat 02 — AvaluarExpressions
public class AvaluarExpressions {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 4;
        int d = 2;

        // TODO: mostra el resultat d'avaluar cada expressió, una per línia:
        //   2 - a * b + c
        //   (2 - a) * b + c
        //   a * b - c * a - d
        //   a / 3 - b
        //   a / (33 - b)
        //   d * 23 - 1 + b

        System.out.println(2 - a * b + c);
        System.out.println((2 - a) * b + c);
        System.out.println(a * b - c * a - d);
        System.out.println(a / 3 - b);
        System.out.println(a / (33 - b));
        System.out.println(d * 23 - 1 + b);
    }
}

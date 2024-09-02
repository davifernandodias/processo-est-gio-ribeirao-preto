import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string ");
        String input = sc.nextLine();

        int count = contarLetra(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }

    }

    public static int contarLetra(String str) {
        int count = 0;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'A') {
                count++;
            }
        }

        return count;
    }
}

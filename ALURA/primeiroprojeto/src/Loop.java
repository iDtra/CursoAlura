import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Diga sua avaliação para o filme ");
             nota = sc.nextDouble();
             mediaAvaliacao +=  nota;
             if (i >=3 ) {
                 System.out.println("Media de avaliações " + mediaAvaliacao / i);
             }
        }

    }
}

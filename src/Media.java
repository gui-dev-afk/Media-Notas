import java.util.Scanner;

public class Media
{
    public static void main(String[] args)
    {
        Scanner resp = new Scanner(System.in);

        String nome;
        float nota[] = new float[4], media;
        char continuar;

        do {


            System.out.print("Qual o seu nome: ");
            nome = resp.next();

            for(int i = 0; i <= 3; i++)
            {
                do {

                    System.out.print("Nota " + (i + 1) + ": ");
                    if(resp.hasNextFloat())
                    {
                        nota[i] = resp.nextFloat();
                    }
                    else
                    {
                        System.out.println("Digite uma NOTA VALIDA!");
                        resp.next();
                        nota[i] = -1;
                    }


                }while(nota[i] > 10 || nota[i] < 0);
            }

            float soma = 0;

            for(int i = 0; i <= 3; i++)
            {
                soma = nota[i] + soma;
            }

            media = (float) soma / 4;

            System.out.println("======================");

            System.out.println("Aluno: " + nome);

            System.out.printf("Notas: ");

            for(int i = 0; i <= 3; i++)
            {
                if (i == 3)
                {
                    System.out.printf(nota[i] + "");
                }
                else
                   System.out.printf(nota[i] + ", ");
            }

            System.out.println();

            if (media >= 7) {

                System.out.printf("Media: %.1f", media);
                System.out.println();
                System.out.println("Situação: APROVADO");

            } else if (media >= 5) {
                System.out.printf("Media: %.1f", media);
                System.out.println();
                System.out.println("Situação: RECUPERÇÃO");
            } else {
                System.out.printf("Media: %.1f", media);
                System.out.println();
                System.out.println("Situação: REPROVADO");
            }


            System.out.println("======================");

            System.out.println();

            do {

                System.out.println("Deseja Cadastrar outro Aluno?(S/N)");
                continuar = resp.next().charAt(0);

            }while(continuar != 'N' && continuar != 'S' && continuar != 'n' && continuar != 's' );

        }while(continuar == 'S' || continuar == 's');


    }
}

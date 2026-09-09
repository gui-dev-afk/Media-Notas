import java.util.Scanner;

public class Media
{
    public static void main(String[] args)
    {
        Scanner resp = new Scanner(System.in);

        String nome;
        float nota1, nota2, nota3, media;
        char continuar;

        do {


            System.out.println("Qual o seu nome?");
            nome = resp.next();

            do {

                System.out.print("Primeira nota foi: ");

                if(resp.hasNextFloat())

                   nota1 = resp.nextFloat();


                else
                {
                    System.out.println("Digite sua NOTA!");
                    resp.next();
                    nota1 = -1;
                }

            } while (nota1 < 0 || nota1 > 10);


            do {

                System.out.print("Segunda nota foi: ");
                if(resp.hasNextFloat())

                   nota2 = resp.nextFloat();

                else
                {
                    System.out.println("Digite sua NOTA!");
                    resp.next();
                    nota2 = -1;
                }

            } while (nota2 < 0 || nota2 > 10);



            do {

                System.out.print("Terceira nota foi: ");
                if(resp.hasNextFloat())

                   nota3 = resp.nextFloat();

                else
                {
                    System.out.println("Digite sua NOTA!");
                    resp.next();
                    nota3 = -1;
                }

            } while (nota3 < 0 || nota3 > 10);

            media = (nota1 + nota2 + nota3) / 3;

            if (media >= 7) {

                System.out.printf(nome + ", sua nota foi %.1f", media);
                System.out.println();
                System.out.print("Situação: APROVADO");

            } else if (media >= 5) {
                System.out.printf(nome + ", sua nota foi %.1f", media);
                System.out.println();
                System.out.print("Situação: RECUPERÇÃO");
            } else {
                System.out.printf(nome + ", sua nota foi %.1f", media);
                System.out.println();
                System.out.print("Situação: REPROVADO");
            }

            System.out.println();

            do {

                System.out.println("Deseja Cadastrar outro Aluno?(S/N)");
                continuar = resp.next().charAt(0);

            }while(continuar != 'N' && continuar != 'S' && continuar != 'n' && continuar != 's' );

        }while(continuar == 'S' || continuar == 's');


    }
}

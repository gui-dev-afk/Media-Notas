import java.util.Scanner;

public class Media
{
    public static void main(String[] args)
    {
        Scanner resp = new Scanner(System.in);

        String nome;
        float nota1, nota2, nota3, media;

        System.out.println("Qual o seu nome?");
        nome = resp.next();

        do {

            System.out.print("Primeira nota foi: ");
            nota1 = resp.nextFloat();

        }while(nota1 < 0 || nota1 > 10);

        do {

            System.out.print("Segunda nota foi: ");
            nota2 = resp.nextFloat();

        }while(nota2 < 0 || nota2 > 10);

        do {

            System.out.print("Terceira nota foi: ");
            nota3 = resp.nextFloat();

        }while(nota3 < 0 || nota3 > 10);

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7)
        {

            System.out.println("APROVADO");
            System.out.printf("Sua nota foi: %.1f", media);

        } else if (media >= 5)
        {
            System.out.println("RECUPERAÇÃO");
            System.out.printf("Sua nota foi: %.1f", media);
        }
        else
        {
            System.out.println("REPROVADO");
            System.out.printf("Sua nota foi: %.1f", media);
        }


    }
}

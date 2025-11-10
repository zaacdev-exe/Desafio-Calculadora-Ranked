package dio.isaac.exercicios;

import java.util.Scanner;

public class DesafioRanked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de Vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.println("Quantidade de Derrotas: ");
        int derrotas = scanner.nextInt();

        String resultado = calcularRank(vitorias, derrotas);
        System.out.println(resultado);

    }

    public static String calcularRank(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel;

        if (vitorias <= 10) {
            nivel = "Ferro";
        } else if (vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        return "O Herói tem de saldo de " + saldoVitorias + " e está no nivel " + nivel;

    }
}

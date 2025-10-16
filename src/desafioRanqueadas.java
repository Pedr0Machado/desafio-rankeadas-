public class desafioRanqueadas {
       /**
     * Função principal para executar a aplicação.
     */
    public static void main(String[] args) {
        // Exemplo 1: Testando um jogador com saldo positivo e nível "Ouro"
        int vitoriasJogador1 = 65;
        int derrotasJogador1 = 12;
        exibirStatusDoJogador(vitoriasJogador1, derrotasJogador1);

        // Exemplo 2: Testando um jogador com poucas vitórias e nível "Ferro"
        int vitoriasJogador2 = 5;
        int derrotasJogador2 = 8;
        exibirStatusDoJogador(vitoriasJogador2, derrotasJogador2);

        // Exemplo 3: Testando um jogador com saldo alto e nível "Imortal"
        int vitoriasJogador3 = 110;
        int derrotasJogador3 = 5;
        exibirStatusDoJogador(vitoriasJogador3, derrotasJogador3);

        // Exemplo 4: Testando um jogador com saldo de vitórias baixo
        int vitoriasJogador4 = 25;
        int derrotasJogador4 = 30;
        exibirStatusDoJogador(vitoriasJogador4, derrotasJogador4);

        // Exemplo 5: Testando um jogador com nível "Diamante"
        int vitoriasJogador5 = 85;
        int derrotasJogador5 = 5;
        exibirStatusDoJogador(vitoriasJogador5, derrotasJogador5);
        
        // Exemplo 6: Testando um jogador com nível "Lendário"
        int vitoriasJogador6 = 95;
        int derrotasJogador6 = 5;
        exibirStatusDoJogador(vitoriasJogador6, derrotasJogador6);
    }

    /**
     * Calcula o saldo de vitórias e determina o nível do jogador com base
     * na quantidade de vitórias.
     *
     * @param vitorias A quantidade de vitórias do jogador.
     * @param derrotas A quantidade de derrotas do jogador.
     * @return Uma string formatada com a mensagem final do status do jogador.
     */
    public static String calcularNivel(int vitorias, int derrotas) {
        // Variável e Operador: Cálculo do saldo de Rankeadas
        int saldoVitorias = vitorias - derrotas;

        // Variável para armazenar o nível
        String nivel = "imortal";

        // Estruturas de Decisão (if-else if-else): Determinação do nível
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } 

        // Retorna o resultado
        // Nota: O Laço de Repetição não é estritamente necessário para este
        // cálculo, mas se quiséssemos simular N partidas ou processar
        // múltiplos jogadores, seria usado. Aqui, a função é chamada
        // múltiplas vezes no `main`.
        return "O Herói tem de saldo de **" + saldoVitorias + "** está no nível de **" + nivel + "**";
    }

    /**
     * Função auxiliar para chamar o cálculo e exibir a saída.
     *
     * @param vitorias A quantidade de vitórias.
     * @param derrotas A quantidade de derrotas.
     */
    public static void exibirStatusDoJogador(int vitorias, int derrotas) {
        String mensagem = calcularNivel(vitorias, derrotas); // Chamada da Função
        System.out.println("Vitórias: " + vitorias + ", Derrotas: " + derrotas);
        System.out.println(mensagem); // Saída
        System.out.println("------------------------------------------------------------------");
    }
}
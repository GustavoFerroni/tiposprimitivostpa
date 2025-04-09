package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Declaração de variáveis primitivas com novo contexto
        byte quantidadeLivros = 10;  // Armazena números pequenos (-128 a 127)
        short anoLancamento = 2023; // Armazena valores um pouco maiores (32.768 a 32.767)
        int habitantesCidade = 1500000; // Tipo mais comum para números inteiros
        long receitaEmpresa = 1000000000L; // Necessário 'L' para valores longos 
        
        float distanciaViagem = 3.75f; // Necessário 'f' no final para indicar float (em milhares de km)
        double temperaturaMedia = 22.5; // Mais preciso que float (temperatura média do ano)
        
        char categoriaProduto  = 'A'; // Armazena um único caractere (Categoria do produto)
        boolean produtoDisponivel = false; // Armazena verdadeiro ou falso (se o produto está disponível ou não)
        
        // Exibição dos valores 
        System.out.println("Quantidade de livros: " + quantidadeLivros);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Habitantes da cidade: " + habitantesCidade);
        System.out.println("Receita da empresa: R$ " + receitaEmpresa);
        System.out.println("Distância da viagem: " + distanciaViagem + " mil km");
        System.out.println("Temperatura média: " + temperaturaMedia + "°C");
        System.out.println("Categoria do produto: " + categoriaProduto);
        System.out.println("Produto disponível? " + produtoDisponivel);
    }
}

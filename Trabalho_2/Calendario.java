package Trabalho_2;


public class Calendario {
    /**
     * Função que recebe como parâmetro o dia, mês e o ano;
     * e retorna o dia da semana equivalente a esta data:
     * 0 -> Domingo
     * 1 -> Segunda-feira
     * 2 -> Terça-feira
     * ...
     * 6 -> Sábado
     */
    public int diaSemana(int dia, int mes, int ano) {
        int f;
        f = ano + dia + 3 * (mes - 1) - 1;
        if (mes < 3) {
            ano = ano - 1;
        }
        if (mes >= 3) {
            f = f - (int) (0.4 * mes + 2.3);
        }
        f = f + (ano / 4) - (int) ((ano / 100 + 1) * 0.75);
        f = f % 7;
        return f;
    }

    /**
     * Função que recebe como parâmetro o ano e retorna um valor lógico
     * indicando se o ano é bissexto (true) ou não (false).
     */
    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    /**
     * Função que recebe como parâmetro o mês e o ano e retorna a
     * quantidade de dias do mês.
     */
    public int diasNoMes(int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return -1; // Mês inválido
        }
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return ehBissexto(ano) ? 29 : 28; // Se o ano for bissexto, se for verdadeiro retorna 29 se n 28 se n
                                                  // retorna 31
            default:
                return 31;
        }
    }

    // Primeiro inclua nesta classe um método imprimeMes que receba como parâmetro
    // um mês e um ano, e então exiba na tela o calendário daquele mês.
    public void imprimeMes(int mes, int ano) {
        // obtendo o dia da semana do primeiro dia do mes
        int p = this.diaSemana(1, mes, ano);
        // Obtendo o maximo de dias do mes
        int max = this.diasNoMes(mes, ano);
        /*
         * \n quebra de linha
         * \t tabulação (tab)
         * System.out.println: exibe o dado e pula de linha
         * System.out.print: exibe o dado sem pular de linha
         */

        int[][] m = new int[6][7];// 5 linhas(semanas) // 7 colunas
        // inicializando a matriz com zeros
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                m[i][j] = 0;
            }
        }
        // preencher a matriz corretamente
        int d = 1;
        for(int i=p;i <7; i++)
        {
            m[0][i]=d;
            d++;
        }



        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (d <= max) {
                    m[i][j] = d;
                    d++;
                }
            }
        }

        // Mostrar a matriz ignorando o zero

        System.out.println("DOM\tSEG\tTER\tQUA\tQUI\tSEX\tSAB");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if(m[i][j]==0)
                    System.out.print("\t");
                else 
                    System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }

    // Em seguida inclua nesta classe um método imprimeCalendario que receba como

    // calendário.
    public void imprimeCalendario(int ano) {
        for( int i=1;i<12;i++)
        {
            System.out.print("Mes:" + i + "\n");
            this.imprimeMes(i,ano);

        }

    }

}
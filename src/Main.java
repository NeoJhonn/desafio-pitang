// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Questão 1
        System.out.println("Questão 1");
        questaoUm();

        System.out.println("\n" + "\n");

        // Questão 2
        System.out.println("Questão 2");
        int a = 4;
        System.out.println("Resposta questão 2= "+ questaoDois(a, a -1));

        System.out.println("\n" + "\n");

        // Questão 4
        System.out.println("Questão 4");
        questaoQuatro();

        System.out.println("\n" + "\n");

        // Questão 5
        System.out.println("Questão 5");
        questaoCinco();

        System.out.println("\n" + "\n");

        // Questão 7
        System.out.println("Questão 7");
        int aa, b, c;
        aa = 0;
        c = 0;

        while (aa < 4) {
            b = questaoSete(aa);
            c = c + b;
            aa = aa + 1;
        }

        System.out.println("Resultado C= "+ c);

        System.out.println("\n" + "\n");

        // Questão 10
        System.out.println("Questão 10");
        questaoDez();



    }

    public static void questaoUm() {
        int vetor[] = {81, 37, 51, 77, 19};
        int naoSei = 0;
        boolean achou = true;

        while (achou) {
            achou = false;

            for (int i=0; i < 4; i++) {

                if (vetor[i] > vetor[i + 1]) {
                    naoSei = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = naoSei;
                    achou = true;
                }
            }
        }
        for (int i=0; i < vetor.length; i++) {
            System.out.println(vetor[i] +", ");
        }
    }

    public static int questaoDois(int z,int k) {
        if ((z == k) || (z == 0)) {
           return 1;
        } else {
            return  questaoDois(z - 1, k) + questaoDois(z - 1, k - 1);
        }
    }

    public static void questaoTres() {
        int h = 0;
        int x = 0;
        int z = 0;

        if     ((h != 5 && x != 3) || // 0 e 0 = 1
                (z != 0 && h == 5) || // 0 e 1 = 1
                (z == 0 && h == 5 && x == 3) || // 1 e 1 e 1 = 1
                (z == 0 && h == 5 && x != 3)) { // 1 e 1 e 0 = 0

        }
    }

    public static void questaoQuatro() {
        int z, b, a;
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        a = 0;

        for (z= 0; z < vetor.length - 1; z++) {

            b = z + 1;
            vetor[z] = b + (3 * z);
            if (z > 0) {
                if ( vetor[b] < vetor[z]) {
                    a = a + 2;
                } else {
                    a = a - 1;
                }
            }
        }

        if (vetor[5] > vetor[10]) {
            for (z = 4; z < vetor.length; z++) {
                vetor[z] = vetor[z] + 1;
            }
        } else {
            for (z = 0; z < vetor.length - 6; z++) {
                vetor[z] = vetor[z] - 2;
            }
        }

        System.out.println("veto[5] = "+ vetor[5]);
    }

    public static void questaoCinco() {
        int w[] = {2, 13, 11, 9, 7, 0};
        int z[] = {3, 10, 11, 8, 0, 4};
        int vetor[] = {1, 2, 3, 4, 5, 6};
        int i, x, u, p = 0;

        for (i=0; i < 6; i++) {
            if (w[i] > z[i]) {
                x = z[i];
                z[i] = w[i];
                w[i] = x;
            } else {
                w[i] = w[i] * 2;
                z[i] = z[i] * 3;
            }
        }
        u = 0;
        u = 0;

        for (i=0; i < 6; i++) {
            u = u + w[i];
            p = p + z[i];
        }

        System.out.println("Resposta: U = "+ u +" / " + "P = "+p);
    }

    public static int questaoSete(int a) {
        if (a == 1) {
            System.out.println("entrou aqui");
            return a + questaoSete(a - 1);
        }

        if (a < 1) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void questaoDez() {
        int matriz[][] = {{1, 2, 3}, {1, 3, 3}};
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int x, z;

        for (x= 0; x < 3; x++) {
            for (z= 0; z < 3; z++) {
                m1[x][z] = x + (2 * z);
            }
        }

        for (x= 0; x < 3; x++) {
            for (z= 0; z < 3; z++) {
                m2[x][z] = m1[z][x];
            }
        }

        System.out.println("M1= "+m1[1][1]);
        System.out.println("M2= "+m1[2][2]);

        System.out.println("Resultado= "+(m1[1][1] + m2[2][2]));
    }
}
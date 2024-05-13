import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //Case 4
        String [] caditados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String canditado: caditados) {
            entrandoEmContato(canditado);
        };
        //Case 3
        /*imprimirSelecionados();*/
        //Case 2
        /*selecaoCanditados();*/
        //Case 1
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
        }

        static void entrandoEmContato(String candidato) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
		    boolean atendeu=false;
		    do {
                //elas precisarão sofrer alterações
			    atendeu= atender();
			    continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
            }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
			
	}
	
        //método auxiliar
	    static boolean atender() {
		    return new Random().nextInt(3)==1;	
	    }

        static void imprimirSelecionados() {
            String [] cadidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
            System.out.println("Imprimindo a lista de candidatos informando o indíce do elemento");
            for(int indice=0; indice < cadidatos.length;indice++){
                System.out.println("O canditado de nº " + (indice+1) + " é o " + cadidatos[indice]);
            }

            System.out.println("Forma abreviada de interação for each");

            for(String canditado: cadidatos) {
                System.out.println("O canditado selecionado foi " + canditado);
            }
        
        }

        static void selecaoCanditados(){
            // Array com a lista de candidatos
            String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
            int cadidatosSelecionados = 0;
            int cadidatosAtual = 0;
            double salarioBase = 2000.0;
            while (cadidatosSelecionados < 5 && cadidatosAtual < candidatos.length) {
                String candidato = candidatos[cadidatosAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O canditado " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O canditado " + candidato + " foi selecionado para a vaga ");
                    cadidatosSelecionados++;
                }
                cadidatosAtual++;
            }
        }

        static double valorPretendido() {
                return ThreadLocalRandom.current().nextDouble(1800, 2200);
                }

        static void analisarCandidato (double salarioPretendido) {
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");

            }else if (salarioBase==salarioPretendido) 
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDITADOS");
        }

        }
}

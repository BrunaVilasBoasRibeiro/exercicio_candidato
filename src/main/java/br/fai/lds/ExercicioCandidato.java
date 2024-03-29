package br.fai.lds;

import br.fai.lds.models.Candidato;

import java.util.*;

public class ExercicioCandidato {
    public static void main(String[] args) {
        ExercicioCandidato app = new  ExercicioCandidato();
        app.start();
    }
    List<Candidato> listaCandidatos = new ArrayList<>();
    private void start() {
        Scanner scanner = new Scanner(System.in);

        //criar a lista de candidatos
        listaCandidatos.add(new Candidato(1,"Joao"));
        listaCandidatos.add(new Candidato(2,"Maria"));
        listaCandidatos.add(new Candidato(3,"Jose"));
        listaCandidatos.add(new Candidato(4,"Antonio"));
        listaCandidatos.add(new Candidato(5,"Tibursinho"));

        // criar o mapa para listar os candidatos
        Map<Integer, Candidato> mapaCandidato = new HashMap<>();
        for (Candidato cadidato : listaCandidatos) {
            mapaCandidato.put(cadidato.getId(),cadidato);
        }
        int voto;

        do{
            System.out.println("Digite seu voto (0 para encerrar): ");
            voto = scanner.nextInt();

            if (voto >= 1 && voto <= 5){
                Candidato candidato = mapaCandidato.get(voto);
                candidato.adicionarVoto();
                System.out.println("Obrigado, seu voto foi registrado");
            }else if(voto !=0 ){
                System.out.println("Opção Invalida!");
            }
        }while (voto != 0);

        // ordenar os candidatos por num de votos (decrescente)
        listaCandidatos.sort((candidato1,candidato2)-> candidato2.getVotos() - candidato1.getVotos());
        System.out.println("O candidato eleito é: " + listaCandidatos.get(0).getNome() + ".");

        for (int i = 0; i < listaCandidatos.size(); i++){
            Candidato candidato = listaCandidatos.get(i);
            System.out.println("Lugar " + (i + 1) + ": " + candidato.getNome() + " - " + candidato.getVotos() + " votos");
        }
    }

}

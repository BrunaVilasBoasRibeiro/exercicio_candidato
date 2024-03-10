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
        


    }

}

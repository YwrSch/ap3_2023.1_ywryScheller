package ywry.unidade2.exercicio1.questao3_SistemaUniversidades;

import java.util.ArrayList;

public class SistemaUniversidades {
    ArrayList<Universidade> universidades;

    public SistemaUniversidades() {
        this.universidades = new ArrayList<Universidade>();
    }

    public ArrayList<Universidade> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(ArrayList<Universidade> universidades) {
        this.universidades = universidades;
    }

    public void registrarUniversidade(Universidade universidade){
        getUniversidades().add(universidade);
    }

    public String encontrarUniversidadeComMaisAlunos(){
        int maior = 0;
        Universidade universidadeComMaisAlunos = new Universidade(null);
        for (int i = 0; i < getUniversidades().size(); i++) {
            int somaAlunos = 0;
            for (int j = 0; j < getUniversidades().get(i).getCursos().size(); j++) {
                for (int k = 0; k < getUniversidades().get(i).getCursos().get(j).getDisciplinas().size(); k++) {
                    somaAlunos += getUniversidades().get(i).getCursos().get(j).getDisciplinas().get(k).getAlunosCadastrados().size();
                }
            }
            if(somaAlunos != 0){
                if(somaAlunos > maior){
                    maior = somaAlunos;
                    universidadeComMaisAlunos = getUniversidades().get(i);
                }
            }
        }
        if(maior==0){
            return "Nenhuma faculdade possui algum aluno registrado em algum curso";
        }else{
            return universidadeComMaisAlunos.getNome();
        }
    }

    @Override
    public String toString() {
        return "SistemaUniversidades [universidades=" + universidades + "]";
    }

}

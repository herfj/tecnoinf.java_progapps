package logica.curso;

import java.util.List;
import java.util.ArrayList;
import logica.entidades.Curso;
import logica.entidades.Instituto;
import logica.datatypes.DTCurso;
import logica.entidades.EdicionCurso;


import javax.persistence.*;

public class ListaCursos {
    public List<Curso> getList() {
        List<Curso> list = null;
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CursoJPA");
        EntityManager entitymanager = emfactory.createEntityManager();

        Query query = entitymanager.createQuery("Select i from Curso as i");
        list = (List<Curso>) query.getResultList();

        entitymanager.close();
        emfactory.close();
        return list;
    }

    public List<Curso> getListCinst(String nameInstituto) {
        List<Curso> list = getList();
        for(Curso curso : list){
            Instituto inst = curso.getInstituto();

            List<Curso> cursosFiltrados = new ArrayList();
            if(nameInstituto.equals(inst.getNombreInstituto())){
                cursosFiltrados.add(curso);
                
            }
        }
        
        return cursosFiltrados;
    }

    public List<DTCurso> getDataTypeList() {
        List<Curso> list = getList();
        List<DTCurso> listOfDT = new ArrayList();
        for (Curso curso : list) {
            DTCurso dtCurso = new DTCurso(curso);
            listOfDT.add(dtCurso);
        }
        return listOfDT;
    }
}

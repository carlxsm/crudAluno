package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public void criarDisciplina(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarTodas() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id) {
        return disciplinaRepository.findById(id);
    }

    public void atualizar(Long id, Disciplina disciplina) {
        Optional<Disciplina> disciplinaDoBanco = buscarPorId(id);

        if (disciplinaDoBanco.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina não encontrada");
        }

        Disciplina disciplinaEditada = disciplinaDoBanco.get();
        disciplinaEditada.setNome(disciplina.getNome());
        disciplinaEditada.setProfessor(disciplina.getProfessor());

        disciplinaRepository.save(disciplinaEditada);
    }

    public void deletar(Long id) {
        disciplinaRepository.deleteById(id);
    }
}

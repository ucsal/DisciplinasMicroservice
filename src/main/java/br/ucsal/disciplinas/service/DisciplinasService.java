package br.ucsal.disciplinas.service;

import br.ucsal.disciplinas.dto.DisciplinasDTO;
import br.ucsal.disciplinas.mapper.DisciplinasMapper;
import br.ucsal.disciplinas.model.Disciplinas;
import br.ucsal.disciplinas.repository.DisciplinasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinasService {

    @Autowired
    private DisciplinasRepository disciplinasRepository;
    @Autowired
    private DisciplinasMapper disciplinasMapper;

    public DisciplinasDTO save(DisciplinasDTO disciplinasDTO){
        Disciplinas disciplinas = disciplinasMapper.toEntity(disciplinasDTO);
        Disciplinas disciplinasSalvo = disciplinasRepository.save(disciplinas);
        return disciplinasMapper.toDTO(disciplinasSalvo);
    }

    public List<Disciplinas> listar() {
        return disciplinasRepository.findAll();
    }

    public DisciplinasDTO findById(Long id) {
        Disciplinas disciplinas = disciplinasRepository.findById(id).orElseThrow(() -> new RuntimeException("Documento não encontrado"));
        return disciplinasMapper.toDTO(disciplinas);
    }

    public void delete (Long id) {
        disciplinasRepository.deleteById(id);
    }
}

package br.ucsal.disciplinas.mapper;


import br.ucsal.disciplinas.dto.DisciplinasDTO;
import br.ucsal.disciplinas.model.Disciplinas;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DisciplinasMapper {
    DisciplinasDTO toDTO(Disciplinas disciplinas);
    Disciplinas toEntity (DisciplinasDTO disciplinasDTO);
}

package br.com.brito.agendadortarefas.business.mapper;

import br.com.brito.agendadortarefas.business.dto.TarefasDTO;
import br.com.brito.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}

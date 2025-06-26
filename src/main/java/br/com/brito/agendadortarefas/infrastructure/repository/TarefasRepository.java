package br.com.brito.agendadortarefas.infrastructure.repository;


import br.com.brito.agendadortarefas.infrastructure.entity.TarefasEntity;
import br.com.brito.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {

    List<TarefasEntity> findByDataEventoBetweenAndStatusNotificacaoEnum(LocalDateTime dataInicial,
                                                                        LocalDateTime dataFinal,
                                                                        StatusNotificacaoEnum status);

    List<TarefasEntity> findByEmailUsuario(String email);
}

package org.turkisi.sarimsakli.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.turkisi.sarimsakli.api.entity.Rhyme;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@CrossOrigin
public interface RhymeRepository extends CrudRepository<Rhyme, Long> {
}

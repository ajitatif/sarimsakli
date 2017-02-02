package org.turkisi.sarimsakli.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.turkisi.sarimsakli.api.entity.Score;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@CrossOrigin
public interface ScoreRepository extends PagingAndSortingRepository<Score, Long> {
}

package org.turkisi.sarimsakli.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.turkisi.sarimsakli.api.entity.User;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@CrossOrigin
public interface UserRepository extends CrudRepository<User, Long> {

}

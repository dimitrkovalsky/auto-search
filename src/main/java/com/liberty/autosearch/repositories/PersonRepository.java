package com.liberty.autosearch.repositories;

import com.liberty.autosearch.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dmytro_Kovalskyi.
 * @since 09.02.2017.
 */
@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}

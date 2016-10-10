package com.jkupcho.interest.ed.jpa;

import com.jkupcho.interest.ed.domain.InterestRate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestRateRepository extends CrudRepository<InterestRate, Integer> {

    InterestRate findOneByDuration(int duration);

}

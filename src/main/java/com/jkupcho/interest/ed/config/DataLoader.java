package com.jkupcho.interest.ed.config;

import com.jkupcho.interest.ed.domain.InterestRate;
import com.jkupcho.interest.ed.jpa.InterestRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final InterestRateRepository interestRateRepository;

    @Autowired
    public DataLoader (InterestRateRepository interestRateRepository) {
        this.interestRateRepository = interestRateRepository;
    }

    @Transactional
    @Override
    public void run(String... strings) throws Exception {
        InterestRate thirtyYearFixed = new InterestRate(30, 3.42f);
        InterestRate fifteenYearFixed = new InterestRate(15, 2.72f);

        interestRateRepository.save(Arrays.asList(thirtyYearFixed, fifteenYearFixed));
    }
}

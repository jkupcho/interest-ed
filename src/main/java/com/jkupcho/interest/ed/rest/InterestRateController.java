package com.jkupcho.interest.ed.rest;

import com.jkupcho.interest.ed.domain.InterestRate;
import com.jkupcho.interest.ed.jpa.InterestRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interest")
public class InterestRateController {

    private final InterestRateRepository interestRateRepository;

    @Autowired
    public InterestRateController (InterestRateRepository interestRateRepository) {
        this.interestRateRepository = interestRateRepository;
    }

    @RequestMapping(value="/{duration}", method = RequestMethod.GET)
    public InterestRate findByDuration(@PathVariable int duration) {
        InterestRate interestRate = interestRateRepository.findOneByDuration(duration);

        if (interestRate == null) { interestRate = interestRateRepository.findOne(1); }

        return interestRate;
    }

}

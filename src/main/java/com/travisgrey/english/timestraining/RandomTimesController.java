package com.travisgrey.english.timestraining;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomTimesController {

    private String[] times = new String[]{
            "   o -> ?", "   o -> .", "   o -> x",
            "   o    ?", "   o    .", "   o    x",
            "-> o    ?", "-> o    .", "-> o    x"
    };

    @RequestMapping("/random-times")
    public String randomTimes() {
        Random random = new Random();
        return times[random.nextInt(times.length)];
    }

}

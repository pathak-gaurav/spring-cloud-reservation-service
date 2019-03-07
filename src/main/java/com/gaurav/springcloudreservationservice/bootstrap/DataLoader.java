package com.gaurav.springcloudreservationservice.bootstrap;

import com.gaurav.springcloudreservationservice.entity.Reservation;
import com.gaurav.springcloudreservationservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DataLoader {

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return strings ->{
            Stream.of("Zack","Cody","Zoella","Gaurav").forEach(x -> reservationRepository.save(new Reservation(x)));
        };
    }
}

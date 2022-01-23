package com.idat.remiseriamvc.demo.controllers;

import com.idat.remiseriamvc.demo.RemiseriaProyectApplication;
import com.idat.remiseriamvc.demo.models.Reservation;
import com.idat.remiseriamvc.demo.services.ReservationService;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RemiseriaProyectApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationControllerTest {
    private MockMvc mockMvc;
    @Autowired
    private ReservationService reservationService;


    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

    }

    @Test
    public void checkAmountBaseReservations() throws Exception {
        assertEquals(2, reservationService.getAll().size());
    }


    @Test
    public void checkRegisterReservation() throws Exception {
        var idDriver = 5;
        var idPassenger = 2;
        var idTariff = 1;
        var description = "Alguna descripcion de prueba";
        Reservation newReservation = new Reservation();
        newReservation.setIdStateReservation(1);
        newReservation.setDescription(description);
        newReservation.setIdDriver(idDriver);
        newReservation.setIdPassenger(idPassenger);
        newReservation.setIdTariff(idTariff);
        newReservation.setTravelDate(new Date());

        var response = reservationService.save(newReservation);
        assertEquals(description, response.getDescription());
        assertEquals(3, reservationService.getAll().size());
    }

    @Test
    public void checkAmountBeetweenDate() throws Exception {
        assertEquals(1, reservationService.getReservationsBetweenDate("2021-12-31 00:00:00", "2021-12-31 23:00:00").size());
    }


    @Test
    public void checkUpdateReservation() throws Exception {
        Integer idStateReservation = 12;
        var idReservation = 1;
        var newDescription = "Alguna descripcion nueva";
        var findReservation = reservationService.findById(idReservation).map(reservation -> {
            return reservation;
        }).orElse(null);
        if (findReservation != null) {
            findReservation.setIdStateReservation(idStateReservation);
            findReservation.setDescription(newDescription);
            var reservationUpdated = reservationService.save(findReservation);
            assertEquals(idStateReservation, reservationUpdated.getIdStateReservation());
            assertEquals(newDescription, reservationUpdated.getDescription());
            assertEquals(1, reservationService.findByIdStateReservation(idStateReservation).size());
        }
    }

    @Test
    public void checkAmountReservationsByIdUser() throws Exception {
        var idUser = 2;
        assertEquals(2, reservationService.findByIdPassenger(idUser).size());
    }


}

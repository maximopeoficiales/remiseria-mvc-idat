package com.idat.remiseriamvc.demo.controllers;

import com.idat.remiseriamvc.demo.RemiseriaProyectApplication;
import com.idat.remiseriamvc.demo.models.Payment;
import com.idat.remiseriamvc.demo.models.Reservation;
import com.idat.remiseriamvc.demo.services.PaymentService;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RemiseriaProyectApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentControllerTest {
    private MockMvc mockMvc;
    @Autowired
    private PaymentService paymentService;


    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

    }

    @Test
    public void checkAmountBasePayment() throws Exception {
        assertEquals(2, paymentService.getAll().size());
    }


    @Test
    public void checkRegisterPayment() throws Exception {
        var idDriver = 5;
        var idEmployee = 1;
        var idVehicule = 2;
        Payment newPayment = new Payment();
        newPayment.setPaymentDate(new Date());
        newPayment.setIdDriver(idDriver);
        newPayment.setIdEmployee(idEmployee);
        newPayment.setIdVehicle(idVehicule);
        newPayment.setAmount(24.0);

        var response = paymentService.save(newPayment);
        assertEquals(3, paymentService.getAll().size());
    }


    @Test
    public void checkUpdateReservation() throws Exception {
        var idPayment = 1;
        Double newAmount = 40.0;
        var findPayment = paymentService.findById(idPayment).map(reservation -> {
            return reservation;
        }).orElse(null);
        if (findPayment != null) {
            findPayment.setAmount(newAmount);
            var reservationUpdated = paymentService.save(findPayment);
            assertEquals(newAmount, reservationUpdated.getAmount());
        }
    }

    @Test
    public void checkAmountBeetweenDate() throws Exception {
        assertEquals(1,paymentService.getPaymentBetweenDate("2021-12-31 00:00:00", "2022-12-31 23:00:00").size());
    }


}

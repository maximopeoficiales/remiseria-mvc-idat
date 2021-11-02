package com.idat.remiseriamvc.demo.domain.responses;

import com.idat.remiseriamvc.demo.domain.entitys.User;
import lombok.AllArgsConstructor;
import lombok.Data;

//estructura de respuesta de la authenticacion
@Data
@AllArgsConstructor
public class AuthenticationResponse {
     private String jwt;

     private User user;

}

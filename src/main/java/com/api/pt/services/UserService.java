package com.api.pt.services;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pt.models.UserModel;
import com.api.pt.repositories.IUserRepository;

@Service
public class UserService {
    
    @Autowired //Añadir dependencias
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        LocalDate fnac= user.getFnacimiento().toLocalDate();
        LocalDate ahora = LocalDate.now();
        Period edad = Period.between(fnac, ahora);
        LocalDate fvinc= user.getFvinculacion().toLocalDate();
        Period tvinc = Period.between(fvinc, ahora);
        if(edad.getYears()>=18){
            user.setEdad(edad);
            user.setTvinculacion(tvinc);
            return userRepository.save(user);
        }else{
            return null;
        }
    }
}

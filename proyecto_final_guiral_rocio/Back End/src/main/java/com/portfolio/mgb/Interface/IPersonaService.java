package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import jakarta.validation.constraints.Positive;
import java.util.List;

public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
}

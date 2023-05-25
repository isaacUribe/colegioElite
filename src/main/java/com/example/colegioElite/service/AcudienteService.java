package com.example.colegioElite.service;

import com.example.colegioElite.entidades.Acudiente;
import com.example.colegioElite.repositorys.AcudienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AcudienteService implements ServicioBase<Acudiente> {

    @Autowired
    public AcudienteRepository acudienteRepository;

    @Override
    public List<Acudiente> findAll() throws Exception {
        try{
           List<Acudiente> acudientes =  acudienteRepository.findAll();
           return acudientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Acudiente findById(Integer id) throws Exception {
        try {
          Optional<Acudiente> acudiente = acudienteRepository.findById(id);
          if(acudiente.isPresent()){
              return acudiente.get();
          }else{
              throw new Exception("Usuario no encontrado");
          }

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Acudiente registrar(Acudiente datosRegistrar) throws Exception {
        try {
            Acudiente acudienteGuardado = acudienteRepository.save(datosRegistrar);
            return acudienteGuardado;

        }catch (Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Acudiente actualizar(Integer id, Acudiente datosNuevos) throws Exception {
        try {
            Optional<Acudiente> acudiente = acudienteRepository.findById(id);
            if(acudiente.isPresent()){
                Acudiente acudienteExistente = acudiente.get();
                acudienteExistente.setNombre(datosNuevos.getNombre());
                acudienteExistente.setTelefono(datosNuevos.getTelefono());
                Acudiente acudienteActualizado = acudienteRepository.save(acudienteExistente);
                return acudienteActualizado;
            }else{
                throw new Exception("Usuario no encontrado");
            }

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean elimiar(Integer id) throws Exception {
        try {
            Optional<Acudiente> acudiente = acudienteRepository.findById(id);
            if(acudiente.isPresent()){
                acudienteRepository.deleteById(id);
                return true;
            }else {
                throw new Exception("Usuario no encontrado");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

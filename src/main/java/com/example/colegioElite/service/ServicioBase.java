package com.example.colegioElite.service;

import java.util.List;

public interface ServicioBase<E> {

    public List<E> findAll() throws Exception;

    public E findById(Integer id) throws Exception;

    public E registrar(E datosRegistrar) throws Exception;

    public E actualizar(Integer id, E datosNuevos) throws Exception;

    public boolean elimiar(Integer id) throws Exception;



}

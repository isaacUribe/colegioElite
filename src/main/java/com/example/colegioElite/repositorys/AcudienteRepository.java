package com.example.colegioElite.repositorys;

import com.example.colegioElite.entidades.Acudiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcudienteRepository extends JpaRepository<Acudiente, Integer> {

}

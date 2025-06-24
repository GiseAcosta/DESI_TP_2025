package tuti.desi.accesoDatos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.desi.entidades.Familia;

@Repository
public interface FamiliaRepositorio extends JpaRepository<Familia, Integer> {

}

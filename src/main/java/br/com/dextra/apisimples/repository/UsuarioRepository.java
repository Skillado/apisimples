package br.com.dextra.apisimples.repository;

import org.springframework.stereotype.Repository;

import br.com.dextra.apisimples.entity.Usuario;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

    List<Usuario> findByNome(String nome);
    List<Usuario> findByIdade(Long idade);
    List<String> findNomeByIdade(Long idade);

}

package in.rihs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rihs.entity.CreateCase;

public interface CreateCaseRepository extends JpaRepository<CreateCase, Serializable> {

}

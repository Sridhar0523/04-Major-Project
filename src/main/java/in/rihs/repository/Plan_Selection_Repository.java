package in.rihs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rihs.entity.Plan_Selection;

public interface Plan_Selection_Repository extends JpaRepository<Plan_Selection, Serializable> {

}

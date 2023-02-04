package in.rihs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rihs.entity.Income_Details;

public interface Income_Details_Repository extends JpaRepository<Income_Details, Serializable> {

}

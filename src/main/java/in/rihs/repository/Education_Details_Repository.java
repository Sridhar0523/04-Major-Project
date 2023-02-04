package in.rihs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rihs.entity.CreateCase;
import in.rihs.entity.Education_Details;

public interface Education_Details_Repository extends JpaRepository<Education_Details, Serializable>{

}

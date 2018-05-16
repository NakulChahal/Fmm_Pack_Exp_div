package Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import pojo.files.webapp.FmmInfrastructure;

@Repository("FmmInfraRepository")
@RepositoryRestResource(collectionResourceRel="FmmInfrastructure", path="data")
public interface FmmInfraRepository extends CrudRepository<FmmInfrastructure , Long> {
	public  List<FmmInfrastructure> findByincharge(String incharge);

	

}

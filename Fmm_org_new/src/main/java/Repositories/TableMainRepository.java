package Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.hellokoding.springboot.FmmOrgMTable;

@Repository("TableMainRepository")
////public interface TableMainRepository extends CrudRepository<FmmOrgMTable, Long>{
@RepositoryRestResource(collectionResourceRel="fmmOrgMTable", path="data")
public interface TableMainRepository extends CrudRepository<FmmOrgMTable, Long>{
		
	public  List<FmmOrgMTable> findByorgSlNo(Long orgSlNo);
	
	
	
}
 
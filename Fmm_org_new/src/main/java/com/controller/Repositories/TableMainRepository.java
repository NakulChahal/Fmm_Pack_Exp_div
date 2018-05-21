package com.controller.Repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.controller.pojo.FmmOrgMTable;


@Repository("TableMainRepository")
@RepositoryRestResource(collectionResourceRel="fmmOrgMTable", path="data")
public interface TableMainRepository extends CrudRepository<FmmOrgMTable, Long>{
		
	public  List<FmmOrgMTable> findByorgSlNo(Long orgSlNo);




	
	
	
}
 
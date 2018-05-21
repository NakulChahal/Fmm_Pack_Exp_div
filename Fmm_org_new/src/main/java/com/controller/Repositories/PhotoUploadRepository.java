package com.controller.Repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.controller.pojo.FmmPhotoInfrastruture;

@Repository("PhotoUploadRepository")
@RepositoryRestResource(collectionResourceRel="FmmPhotoInfrastruture", path="data")
public interface PhotoUploadRepository extends CrudRepository<FmmPhotoInfrastruture, Long > {
	public List<FmmPhotoInfrastruture> findByorgSlNo(Long orgSlNo);
	
}


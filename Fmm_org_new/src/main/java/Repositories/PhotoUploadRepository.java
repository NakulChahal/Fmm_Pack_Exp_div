package Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pojoclasses.FmmPhotoInfrastruture;

public interface PhotoUploadRepository extends CrudRepository<FmmPhotoInfrastruture, Long > {
	public List<FmmPhotoInfrastruture> findByorgSlNo(Long orgSlNo);
	
}


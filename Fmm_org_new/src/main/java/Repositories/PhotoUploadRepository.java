package Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pojo.files.webapp.FmmPhotoInfrastruture;

public interface PhotoUploadRepository extends CrudRepository<FmmPhotoInfrastruture, Long > {
	public List<FmmPhotoInfrastruture> findByorgSlNo(Long orgSlNo);
	//public List<FmmPhotoInfrastruture> findByPhotoSlNo(Long PhotoSlNo);
}


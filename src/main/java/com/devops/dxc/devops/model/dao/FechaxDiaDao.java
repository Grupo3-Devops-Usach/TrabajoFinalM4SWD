package com.devops.dxc.devops.model.dao;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.devops.dxc.devops.model.entity.FechaxDia;

public interface FechaxDiaDao extends CrudRepository<FechaxDia, Long>{
	
	FechaxDia findByFecha(Date fecha);
}

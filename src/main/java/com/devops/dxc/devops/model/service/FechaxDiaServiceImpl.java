package com.devops.dxc.devops.model.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devops.dxc.devops.model.dao.FechaxDiaDao;
import com.devops.dxc.devops.model.entity.FechaxDia;

@Service
public class FechaxDiaServiceImpl implements IFechaxDiaService{

	private FechaxDiaDao fechaxDiaDao;
	
	@Override
	@Transactional(readOnly = true)
	public FechaxDia findByFecha(Date fecha) {		
		return fechaxDiaDao.findByFecha(fecha);
	}

	@Override
	@Transactional(readOnly = true)
	public FechaxDia guardarFecha(FechaxDia fechaxDia) {
		return fechaxDiaDao.save(fechaxDia);
	}

}

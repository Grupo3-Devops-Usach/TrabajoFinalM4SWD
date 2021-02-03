package com.devops.dxc.devops.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devops.dxc.devops.model.dao.FechaxDiaDao;
import com.devops.dxc.devops.model.entity.FechaxDia;

@Service
public class FechaxDiaServiceImpl implements IFechaxDiaService{

	@Autowired
	private FechaxDiaDao fechaxDiaDao;
	
	@Override
	@Transactional(readOnly = true)
	public FechaxDia findFecha() {
		FechaxDia fechaxDia =  new FechaxDia();
		List<FechaxDia> listFecha = (List<FechaxDia>)fechaxDiaDao.findAll();
		if(!listFecha.isEmpty()) {
			fechaxDia = listFecha.get(0);
		}
		return fechaxDia ;
	}

	@Override
	public FechaxDia guardarFecha(FechaxDia fechaxDia) {
		return fechaxDiaDao.save(fechaxDia);
	}

}

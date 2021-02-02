package com.devops.dxc.devops.model.service;

import java.util.Date;

import com.devops.dxc.devops.model.entity.FechaxDia;

public interface IFechaxDiaService {

	public FechaxDia findByFecha(Date fecha);
	public FechaxDia guardarFecha(FechaxDia fechaxDia);
}

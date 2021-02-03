package com.devops.dxc.devops.model.service;

import com.devops.dxc.devops.model.entity.FechaxDia;

public interface IFechaxDiaService {

	public FechaxDia findFecha();
	public FechaxDia guardarFecha(FechaxDia fechaxDia);
}

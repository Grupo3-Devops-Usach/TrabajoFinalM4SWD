package com.devops.dxc.devops.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Uf implements Serializable{

	private static final long serialVersionUID = 1549710836175127713L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private Integer valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
	
}

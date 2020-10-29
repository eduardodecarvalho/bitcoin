package org.acme.resteasy.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.json.bind.annotation.JsonbProperty;

public class Bitcoin {

	private Long id;
	@JsonbProperty("preco")
	private BigDecimal price;
	@JsonbProperty("tipo")
	private String operationType;
	@JsonbProperty("data")
	private LocalDate date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}


}

package com.isaacs.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "stock")
@XmlRootElement
public class Stock {
	private Integer id;
	private String code = "";
	private String name = "";
	private Market market = null;
	private List<Price> prices = null;

	public Stock() {
	}

	public Stock(String code, String name, Integer idmarket) {
		setCode(code);
		setName(name);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	@XmlElement
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "code", nullable = false, length = 45)
	@XmlElement
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", length = 45)
	@XmlElement
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name = "idmarket", nullable = false)
	@XmlTransient
	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@OneToMany(mappedBy = "stock", cascade = { javax.persistence.CascadeType.ALL })
	@XmlTransient
	public List<Price> getPrices() {
		return this.prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}
}
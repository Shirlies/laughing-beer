package com.beer.game.vainner.model;



public  class GameProducerParameter implements
		java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Double price;
	private Double cost;
	private Double delayCost;
	private Double repertoryCost;
	private Double startCost;
	private Double discount;
	private Double origin;
	private Integer gameId;

	// Constructors

	public GameProducerParameter() {
	}

	public GameProducerParameter(Double price, Double cost,
			Double delayCost, Double repertoryCost, Double startCost,
			Double discount, Double origin, Integer gameId) {
		this.price = price;
		this.cost = cost;
		this.delayCost = delayCost;
		this.repertoryCost = repertoryCost;
		this.startCost = startCost;
		this.discount = discount;
		this.origin = origin;
		this.gameId = gameId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getDelayCost() {
		return this.delayCost;
	}

	public void setDelayCost(Double delayCost) {
		this.delayCost = delayCost;
	}

	public Double getRepertoryCost() {
		return this.repertoryCost;
	}

	public void setRepertoryCost(Double repertoryCost) {
		this.repertoryCost = repertoryCost;
	}

	public Double getStartCost() {
		return this.startCost;
	}

	public void setStartCost(Double startCost) {
		this.startCost = startCost;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getOrigin() {
		return this.origin;
	}

	public void setOrigin(Double origin) {
		this.origin = origin;
	}

	public Integer getGameId() {
		return this.gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	
	
	public String toString() {
		return "producer config :" + this.price + " " + this.delayCost + " "
				+ this.repertoryCost + " " + this.startCost + " "
				+ " " + this.discount + " " + this.origin
				+ " " + this.cost;
	}
}
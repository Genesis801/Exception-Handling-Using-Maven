package com.capgemini.Book.model;

/**
 * @author genesis
 *
 */
public class Book {

	private int bid;
	private String bname;
	private double bprice;

	/**
	 * @param bid
	 * @param bname
	 * @param bprice
	 */
	public Book(int bid, String bname, double bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}

	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}

	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}

	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}

	/**
	 * @return the bprice
	 */
	public double getBprice() {
		return bprice;
	}

	/**
	 * @param bprice the bprice to set
	 */
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (Double.doubleToLongBits(bprice) != Double.doubleToLongBits(other.bprice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book id : " + bid + ", Book name : " + bname + ", Book price : " + bprice;
	}

}

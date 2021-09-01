package com.company;

public class Video {
	private String ID;
	private String title;
	private String genre;
	private int rental_type; // 1 for 1-week loan and 2 for 2-day loan
	private boolean rental_status;	// false for available and true for borrowed
	public Video(String iD, String title, String genre, int rental_type, boolean rental_status) {
		super();
		ID = iD;
		this.title = title;
		this.genre = genre;
		this.rental_type = rental_type;
		this.rental_status = rental_status;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRental_type() {
		return rental_type;
	}
	public void setRental_type(int rental_type) {
		this.rental_type = rental_type;
	}
	public boolean isRental_status() {
		return rental_status;
	}
	public void setRental_status(boolean rental_status) {
		this.rental_status = rental_status;
	}
	@Override
	public String toString() {
		return "Video [Title=" + title + ", genre=" + genre + ", rental_type=" + rental_type + "]";
	}
}

package com.company;

import java.util.ArrayList;

public class VideoStore {
	private CustomerList customerList;
	private VideoList videoList;
	
	public VideoStore() {
		this.videoList = new VideoList();
		this.customerList = new CustomerList();
	}

	public Video getVideo(String ID) {
		return videoList.getVideo(ID);
	}
	
	public boolean addVideo(Video vid) {
		return videoList.addVideo(vid);
	}
	
	public Customer getCustomer(String ID) {
		return customerList.getCustomer(ID);
	}
	
	public boolean addCustomer(Customer cust) {
		return customerList.addCustomer(cust);
	}

	public void printAllVideo() {
		while (videoList.hasNext()) {
			Video video  = (Video) videoList.next();
			System.out.println(video.toString());
		}
	}

	public void printAllCustomer() {
		while (customerList.hasNext()) {
			Customer customer  = (Customer) customerList.next();
			System.out.println(customer.toString());
		}
	}

	public static void main(String[] args) {
		VideoStore myStore = new VideoStore();
		//create 3 video items
		Video vid = new Video("VD001", "Divergent", "Action", 1, false);
		myStore.addVideo(vid);
		vid = new Video("VD002", "Green Eggs and Ham", "Comedy", 1, false);
		myStore.addVideo(vid);
		vid = new Video("VD003", "Gone with the wind", "Drama", 2, false);
		myStore.addVideo(vid);
		
		//create 3 customers
		Customer cust = CustomerFactory.create("vip", "Ngo Bao Chau", "12 Math Avenue", "VIP001", "0203050813");
		myStore.addCustomer(cust);
		cust.borrowVid(myStore.getVideo("VD001"));
		cust = CustomerFactory.create("guest","Pham Nhat Vuong", "12 Money Road", "G002", "0399999999");
		myStore.addCustomer(cust);
		cust.borrowVid(myStore.getVideo("VD002"));
		cust = CustomerFactory.create("guest","Nguyen Xuan Phuc", "12 Politics Street", "G003", "0311112222");
		myStore.addCustomer(cust);
		cust.borrowVid(myStore.getVideo("VD003"));
		cust = CustomerFactory.create("supervip", "", "", "", "");
		myStore.addCustomer(cust);

		// Print all video and customer by iterator
		myStore.printAllVideo();
		myStore.printAllCustomer();
	}

}

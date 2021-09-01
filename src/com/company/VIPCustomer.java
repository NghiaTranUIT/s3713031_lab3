package com.company;

public class VIPCustomer extends Customer {
	private int reward_points;
	
	public VIPCustomer(String name, String address, String iD, String phone) {
		super(name, address, iD, phone);
		this.reward_points = 0;
	}
	public VIPCustomer(String name, String address, String iD, String phone, int reward_points) {
		super(name, address, iD, phone);
		this.reward_points = reward_points;
	}
	
	public int getReward_points() {
		return reward_points;
	}
	public void setReward_points(int reward_points) {
		this.reward_points = reward_points;
	}
	
	@Override
	public boolean borrowVid(Video rental) {
		if (super.borrowVid(rental)) {
			if (reward_points>=100)
				reward_points = 0;
			else
				reward_points += 10;
			System.out.println("Customer "+this.getName()+" now has "+this.getReward_points()+" reward points");
			return true;
		}
		return false;
	}
}

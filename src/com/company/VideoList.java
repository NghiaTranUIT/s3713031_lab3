
package com.company;
import java.util.ArrayList;

public class VideoList implements Iterator {
	private ArrayList<Video> theList;
	private Integer index = 0;

	public VideoList() {
		this.theList = new ArrayList<Video>();
	}
	
	public ArrayList<Video> getList() {
		return this.theList;
	}
	
	public Video getVideo(String id) {
		for (int i = 0; i < this.theList.size(); i++) {
			Video temp = this.theList.get(i);
			if (temp.getID().equals(id))
				return temp;
		}
		System.out.println("Video " + id + " not found");
		return null;
	}
	
	public boolean addVideo(Video vid) {
		for (int i = 0; i < this.theList.size(); i++) {
			Video temp = this.theList.get(i);
			if (temp.getID().equals(vid.getID()))
				return false;
		}
		theList.add(vid);
		return true;
	}

	@Override
	public boolean hasNext() {
		if (index >= theList.size()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Object obj = theList.get(index);
			index += 1;
			return obj;
		}
		return null;
	}
}

package com.qa.dvd_store.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.qa.dvd_store.model.Dvd;

public class DvdStore {
	
	private List<Dvd> dvdsInStore;
	
	public DvdStore() {
		dvdsInStore = new ArrayList<Dvd>();
	}

	public void create(Dvd dvd) {
		dvdsInStore.add(dvd);
	}

	public List<String> getInfoList() {
		return dvdsInStore.stream()
						  .map(dvd -> dvd.toString())
						  .collect(Collectors.toList());
	}

	public void remove(Dvd dvdToRemove) {
		dvdsInStore.remove(dvdToRemove);
	}

}

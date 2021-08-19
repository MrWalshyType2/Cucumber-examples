package com.qa.dvd_store.service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.qa.dvd_store.model.Dvd;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DvdStepDefinitions {
	
	private DvdStore dvdStore;
	private List<Dvd> newDvdsToAdd;
	private List<String> expectedOutputList;
	private Dvd dvdToRemove;
	
	@DataTableType
	public Dvd transformDvdData(Map<String, String> data) {
		return new Dvd(
				data.get("Title"),
				Integer.valueOf(data.get("Year")),
				data.get("Actor"),
				Integer.valueOf(data.get("ID"))
		);
	}

	@Given("a dvd store")
	public void aDvdStore() {
	    this.dvdStore = new DvdStore();
	}

	@Given("the following new DVDs")
	public void theFollowingNewDVDs(List<Dvd> dvds) {
	    newDvdsToAdd = dvds;
	}

	@Given("the expected outputs")
	public void theExpectedOutputs(List<String> expectedOutput) {
	    this.expectedOutputList = expectedOutput;
	}

	@When("the new DVDs are added to the store")
	public void theNewDVDsAreAddedToTheStore() {
	    for (Dvd dvd : newDvdsToAdd) {
	    	dvdStore.create(dvd);
	    }
	}

	@Then("the get dvd list request should return the expected outputs")
	public void theGetDvdListRequestShouldReturnTheExpectedOutputs() {
	    assertEquals(expectedOutputList, dvdStore.getInfoList());
	}

	@Given("the following DVDs in the store")
	public void theFollowingDvdsInTheStore(List<Dvd> dvds) {
	    for (Dvd dvd : dvds) {
	    	dvdStore.create(dvd);
	    }
	}

	@Given("the dvd to remove")
	public void theDvdToRemove(Dvd dvd) {
	    this.dvdToRemove = dvd;
	}

	@When("the dvd is removed")
	public void theDvdIsRemoved() {
		dvdStore.remove(dvdToRemove);
	}

}

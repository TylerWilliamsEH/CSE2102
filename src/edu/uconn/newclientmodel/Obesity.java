package edu.uconn.newclientmodel;

import edu.uconn.common.Enum.MealTypes;

public class Obesity extends Condition {

	protected MealTypes myTypeofMeal; // From enumerated type MealTypes
	protected int myCaloriesPerMeal = 0;

	public Obesity() {
	};

	public void setMyTypeofMeal(MealTypes myTypeofMeal) {
		this.myTypeofMeal = myTypeofMeal;
	}

	public MealTypes getMyTypeofMeal() {
		return myTypeofMeal;
	}

	public void setMyCaloriesPerMeal(int myCaloriesPerMeal) {
		this.myCaloriesPerMeal = myCaloriesPerMeal;
	}

	public int getMyCaloriesPerMeal() {
		return myCaloriesPerMeal;
	}

}

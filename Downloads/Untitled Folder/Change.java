class Change {
	
	
	public static int getNumOfToonies(int changeNeeded){
		return changeNeeded/200;
	}
		
	public static int getNumOfLoonies(int changeNeeded){
		return changeNeeded%200/100;
	}
	public static int getNumOfQuarters(int changeNeeded){
		
		return changeNeeded %200%100/25;
	}
	public static int getNumOfDimes(int changeNeeded){
		return changeNeeded %200 %100 %25/10;
	}
	public static int getNumOfNickels(int changeNeeded){
		return changeNeeded %200 %100 %25 %10/5;
	}
	public static int getNumOfPennies(int changeNeeded){
		
		return changeNeeded %200 %100 %25 %10 %5;
	}
}

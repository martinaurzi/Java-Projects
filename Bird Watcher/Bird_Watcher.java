class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
       for(int i=0; i<birdsPerDay.length-1; i++)
           if(birdsPerDay[i]==0)
               return true;

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
      int count = 0;

      if(numberOfDays > birdsPerDay.length)
          numberOfDays = birdsPerDay.length;

      for(int i=0; i<numberOfDays; i++)
          count += birdsPerDay[i];
      
      return count;
    }

    public int getBusyDays() {
       int countBusyDays = 0;
        
      for(int i=0; i<birdsPerDay.length-1; i++)
         if(birdsPerDay[i] >= 5)
             countBusyDays++;

      return countBusyDays;
    }
}
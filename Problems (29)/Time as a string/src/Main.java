class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String addZero(int incik){
        if(incik<10){
            return "0"+String.valueOf(incik);
        }
        else
            return String.valueOf(incik);
    }

    @Override
    public String toString() {
        return addZero(hours)+":"+addZero(minutes)+":"+addZero(seconds);
    }
}
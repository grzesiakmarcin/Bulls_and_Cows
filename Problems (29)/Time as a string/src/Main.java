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

        if(incik <10){
            return "0"+ String.valueOf(incik);
        }
        else
            return String.String.valueOf(incik);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  hours +":"+ minutes+":" + seconds;
    }
}
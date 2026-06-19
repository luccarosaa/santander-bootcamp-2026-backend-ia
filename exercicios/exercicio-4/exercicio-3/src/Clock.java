abstract sealed class Clock permits BRLClock, EUAClock{
    protected int hour;

    protected int minutes;

    protected int seconds;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        if (minutes >= 60){
            this.minutes = 60;
            return;
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        if (seconds >= 60){
            this.seconds = 60;
            return;
        }
        this.seconds = seconds;
    }

    private String format(int value) {
        return value < 10 ? "0" + value : String.valueOf(value);
    }

    public String getTime(){
        return format(hour) + ":" + format(minutes) + ":" + format(seconds);
    }

    abstract Clock convert(Clock clock);
}
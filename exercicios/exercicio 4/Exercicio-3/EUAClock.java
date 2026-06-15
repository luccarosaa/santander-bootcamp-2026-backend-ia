public non-sealed class EUAClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforMidday() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        setBeforMidday();

        if ((hour > 12) && (hour <= 23)){
            setAfterMidday();
            this.hour = hour - 12;
        } else if (hour >= 24){
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock){
        this.seconds = clock.getSeconds();
        this.minutes = clock.getMinutes();

        switch (clock){
            case EUAClock euaClock ->{
                this.hour = euaClock.getHour();
                this.periodIndicator = euaClock.getPeriodIndicator();
            }

            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }

        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.periodIndicator;
    }

}

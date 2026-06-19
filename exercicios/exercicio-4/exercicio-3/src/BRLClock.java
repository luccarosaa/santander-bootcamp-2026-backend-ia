public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock){
        this.seconds = clock.getSeconds();
        this.minutes = clock.getMinutes();

        switch (clock){
            case EUAClock euaClock ->{
                this.hour = (euaClock.getPeriodIndicator().equals("PM")) ?
                        euaClock.getHour() + 12 :
                        euaClock.getHour();
            }

            case BRLClock brlClock -> this.hour = brlClock.getHour();
        }

        return this;
    }

}
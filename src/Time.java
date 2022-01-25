

public class Time {
    int hh, mm, ss;

    int convertToSeconds(int hr, int min, int sec) {
        return ((hr * 60) + min) * 60 + sec;
    }

    Time convertToTimeInterval(int seconds) {
        Time t = new Time();
        int n = seconds % (24 * 3600);
        t.hh = n / 3600;

        n %= 3600;
        t.mm = n / 60;

        n %= 60;
        t.ss = n;

        return t;
    }

    Time addTimeInterval(Time t1, Time t2) {
        Time t = new Time();
        int timeInterval1, timeInterval2, sumInSeconds;
        timeInterval1 = convertToSeconds(t1.hh, t1.mm, t1.ss);
        timeInterval2 = convertToSeconds(t2.hh, t2.mm, t2.ss);
        sumInSeconds = timeInterval1 + timeInterval2;
        t = convertToTimeInterval(sumInSeconds);
        return t;
    }
}

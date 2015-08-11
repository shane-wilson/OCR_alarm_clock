package alarmclock

/**
 * Created by ollyshaw on 11/08/15.
 */
class AlarmClock {
  def read(timeAsString: String) = {
    val time  = new Time(timeAsString)
    if(time.mins == 0 && time.hours == 7)
      "wake up"
    else if (time.mins == 0)
      "beep"
    else
      "tick"
  }

}

class Time(inputString: String) {
  def hours = inputString.substring(0, 2).toInt

  def mins = inputString.substring(3,5).toInt
}

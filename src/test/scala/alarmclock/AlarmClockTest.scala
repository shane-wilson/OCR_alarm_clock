package alarmclock

import org.scalatest.{FlatSpec, Matchers}

class AlarmClockTest extends FlatSpec with Matchers{

  "Alarm Clock" should "tick every minute" in {
    val clock = new AlarmClock
    val sound = clock.read("18:05")
    sound should be ("tick")
  }

  it should "beep every hour" in {
    val clock = new AlarmClock
    val sound = clock.read("18:00")
    sound should be ("beep")
  }

  it should "wake us up at 7" in {
    val clock = new AlarmClock
    val sound = clock.read("07:00")
    sound should be ("wake up")
  }

}

package creational.singleton;

class SlowButThreadSafe extends Singleton {
  private int hidden;

  private SlowButThreadSafe(int hidden) {
    this.hidden  = hidden;
  }

  public static Singleton getInstance(int hidden) {
    synchronized(SlowButThreadSafe.class) {
      if (instance == null) instance = new SlowButThreadSafe(hidden);
    }
    return instance;
  }
}

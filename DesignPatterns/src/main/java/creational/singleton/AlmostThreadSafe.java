package creational.singleton;

class AlmostThreadSafe extends Singleton {
  private static Singleton instance;
  private int hidden;

  private AlmostThreadSafe(int hidden) {
    this.hidden  = hidden;
  }

  public static Singleton getInstance(int hidden) {
    if (instance == null) {
      synchronized(SlowButThreadSafe.class) {
        if (instance == null)
          instance = new AlmostThreadSafe(hidden);
      }
    }
    return instance;
  }
}

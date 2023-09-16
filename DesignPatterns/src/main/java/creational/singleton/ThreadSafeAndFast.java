package creational.singleton;

class ThreadSafeAndFast extends Singleton {
  private static volatile Singleton instance;
  private int hidden;

  private ThreadSafeAndFast(int hidden) {
    this.hidden = hidden;
  }

  public static Singleton getInstance(int hidden) {
    if (instance == null)  {
      synchronized(ThreadSafeAndFast.class) {
        if (instance == null) instance = new ThreadSafeAndFast(hidden);
      }
    }
    return instance;
  }
}

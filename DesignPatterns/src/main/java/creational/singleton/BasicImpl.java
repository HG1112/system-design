package creational.singleton;

class BasicImpl extends Singleton {
  private int hidden;

  private BasicImpl(int hidden) {
    this.hidden = hidden;
  }

  public static Singleton getInstance(int hidden) {
    if (instance == null)
      instance = new BasicImpl(hidden);
    return instance;
  }
}

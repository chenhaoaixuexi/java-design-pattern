package observer;

public interface Subject {
	public void registerObserver(Observer obs);
	public void unRigisterObserver(Observer obs);
	public void notisfyObserver();
}

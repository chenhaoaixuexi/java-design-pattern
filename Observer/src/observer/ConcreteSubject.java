/**
 * 
 */
package observer;

import java.util.ArrayList;

/**
 * @author 26306
 *
 */
public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observer;

	/**	
	 * 
	 */
	public ConcreteSubject() {
		// TODO Auto-generated constructor stub
		observer = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observer.Subject#registerObserver()
	 */
	@Override
	public void registerObserver(Observer obs) {
		observer.add(obs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observer.Subject#unRigisterObserver()
	 */
	@Override
	public void unRigisterObserver(Observer obs) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observer.Subject#notisfyObserver()
	 */
	@Override
	public void notisfyObserver() {
		// TODO Auto-generated method stub

	}

}

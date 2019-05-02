/**
 * 
 *
 */
package fr.openClassrooms.tp;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author franck Desmedt question 14/29 de codingame Java SQL
 */
public class CounterQuestion14 {
	private static int count = 0;

//increments count in thread-safe manner
	public static int increment() {
		count = count + 1;
		return count;
	}

//cette ecriture n'est pas safe thread il faut rajouter synchronized 	
	private static int count2 = 0;

	// increments count in thread-safe manner
	public static synchronized int increment2() {
		count2 = count2 + 1;
		return count2;

	}

	// 2éme méthode thread-safe avec le type AtomicInteger et
//	getAndIncrement

	private static AtomicInteger count3 = new AtomicInteger(0);

	public static synchronized int increment3() {

		return count3.getAndIncrement();

	}
}

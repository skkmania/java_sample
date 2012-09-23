/**
 *	sample from eclipse book 
 */
package jp.tuyano.eclipsebook;

/**
 * @author skkmania
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 12344;
		while (12345 % n > 0){
			n--;
		}
		System.out.println(n);
		System.out.println(12345 / n);
	}

}

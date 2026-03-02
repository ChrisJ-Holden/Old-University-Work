
public class ArrayProcessor {
	public int getArrayLength(Object [] a) {
		int count = 0;
		
		while (true) {
			try {
				Object t = a[count];
				count++;
			} catch (Exception e) {
				break;
			}
		}
		return count;
	}
}

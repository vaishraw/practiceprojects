package try_catch;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30};
		try {
			arr[7]=3;
			
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of bound");
		}
		finally {
			System.out.println("the array is of size: "+arr.length);
		}
	}

}

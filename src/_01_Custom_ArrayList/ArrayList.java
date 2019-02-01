package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public void add(T val) {
		T [] arr2 = (T[]) new Object[arr.length+1];
		arr2[arr2.length-1] = val;
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr = arr2;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr2 = (T[]) new Object[arr.length+1];
		
		arr2[loc] = val;
		for (int j = 0; j < arr.length; j++) {
		
		if(loc > j) {
			arr2[j] = arr[j];
			
		} else {
			arr2[j+1] = arr[j];
		}
		}
		arr = arr2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
T[] arr2 = (T[]) new Object[arr.length+1];
		
		arr2[loc] = val;
		for (int i = 0; i < arr.length; i++) {
			
		
		if(loc != i) {
			arr2[i] = arr[i];
		}}
		
		arr = arr2;
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr2 = (T[]) new Object[arr.length-1];
		
		
		for (int i = 0; i < arr.length; i++) {
			if(loc > i) {
				arr2[i] = arr[i];
			}
			else if(loc<i){
				arr2[i-1] = arr[i];
			}	
		}
		
		arr = arr2;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size(){
	
		return arr.length;
	}
	
	
	
}
package needOfCollection;

public class Introduction {
	
	//if we want to store values let say for ids as 1 ,2 , ....10000 than we need to use variable 10000 times...
	/*
	 * that is burst programming
	 */
	
	//hence array introduce
	//let see
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] id = new int[10000];
	for(int i=0;i<10000;i++) {
		id[i] = i;
	}
	
	/*for(int i1=0;i1<10000;i1++) {
		System.out.print(id[i1] + " ");
	}*/
	
	/*
	 * but still arrays have limitations
	 * 1. fixed size
	 * 2. homogenous data
	 * 3. no underline data structure
	 */
	
	/*
	 * but still a concept of object array to dealt with hetrogenous of that is lets see
	 */
	 
	//let see in next class...... ObjectArray.java
	
	/*
	 * to overcome arrays limitation we have---
	 * collection framework 
	 * which are-
	 * 1. growable
	 * 2. heterogenous data
	 * 3. having underline data structures
	 */
	
	/*
	 * What is Collection and collection framework
	 * collection is the group of individual objects as a single entity
	 * whereas collection framework is define as the several classes and iterfaces which uses group of objects as a single entity.... 
	 */
	
	//now let see 9 key elements of collection framework---
	/*
	 * Collection
	 * list
	 * set
	 * sorted set
	 * navigable set
	 * Queue
	 * map
	 * sorted map
	 * navigable map
	 */
	
	//collection interface is a root interface of collection frameworks...
	//they have methods ...
	
	/*
	 * collection vs collections
	 * collection is a interface
	 * whereas collections is a class which have methods such as sort,suffle,search etc... 
	 */
	
	  /*
	   * now let see all above defined things one by one....
	   */
	
	
	}
	

}

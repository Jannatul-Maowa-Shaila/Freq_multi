package frequency_multi.frequency_multi1;

import java.util.Arrays;

public class Freq_multi {

	
	public static void main(String args[]) 
	  { 

		
//////////////////////////////////////////////////////////////////////////// Multiplecation of 2 nmax///////////	
//		int[] array= {8,11,7,9,6,10};
//		int max=0,max2=0,mult;
//		for(int i=0;i<array.length;i++) {
//			if(array[i]>max) {
//				max=array[i];
//			//System.out.println(max);
//			
//			}
//			
//		}
//		
//		for(int i=0;i<array.length;i++) {
//			if(array[i]>max2 && array[i]!=max) {
//				max2=array[i];
//			//System.out.println(max2);
//			
//			}
//			
//		}
//		
//		mult=max*max2;
//		System.out.println("max:"+mult);
//		
//		
//	  }
	
/////////////////////////////////////////////////////////////////////////////Frequency////////////////////
		
		
		 int[] array= {3,1,1,2,2,4,1,1,2,2,3};
		  int barray[] = new int[array.length];
		  int countf[]={0,0,0,0,0,0,0,0,0,0,0};
		  
		  int minf[]=new int[array.length];
		  barray = Arrays.copyOf(array, array.length);
	try {
	 
  	
  	
		int a, b, max = 0, min = array.length, k = 0, i, l=0, j, count;
		
		for (i = 0, k = 0; i < array.length; i++) {

			count=0;
			a=array[i];
			
			for (j = 0; j <barray.length; j++) {
				
				

				if (a== barray[j]) {
					

					count++;
					
					barray[j] = -1;

				}
				
				
			}	
			
			countf[l] = count;
			
			l++;

		}
		
	}catch(Exception e) {
		System.out.println("error:"+e.getMessage());
	}
		

	
	
	for (int p = 0; p< array.length; p++) {
		if(countf[p]!=0) {
			System.out.println(" number in array:"+array[p]);
			System.out.println("array of frequency:"+countf[p]);
		}
		
		
	}

		}
  	
  	
}

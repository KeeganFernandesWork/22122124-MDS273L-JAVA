import java.util.Scanner;
class lab3{
	public static float mean(int[] a){
		float sum = 0;
		for(int i: a){
			sum += i;
		}
		float mean = sum/(a.length);
		return mean;
	}
	public static int[] frequency(int[] arr ){
		int [] fr = new int [arr.length];
        	int visited = -1;

        	for(int i = 0; i < arr.length; i++){
            		int count = 1;
            		for(int j = i+1; j < arr.length; j++){
                		if(arr[i] == arr[j]){
                    		count++;
                  		//To avoid counting same element again
                    		fr[j] = visited;
                		}
            		}
            		if(fr[i] != visited)
                	fr[i] = count;
        	}
		return fr;
	}

	public static int mode(int[] a){
		int[] fr= frequency(a);
		int max = 0;
		
		int max_index = 0;
		for(int i = 0; i < fr.length; i++){  
            		if(fr[i] != -1){
				if(max > fr[i]){
					max = fr[i];
					max_index = i;
				}
			}
		}	
		return a[max_index];
	}
	public static int[] sort(int[] arr){
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++)
			{
				int tmp = 0;
				if (arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
	
		}
		return arr;
	}
	public static float median(int[] a){
		int[] sorted_array = sort(a);
		if(sorted_array.length%2 == 1){
			return (float)sorted_array[a.length/2];
		}
		else{
			return (float)(sorted_array[a.length/2] + sorted_array[a.length/2 +1])/2;
			
		}
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int num = Integer.parseInt(sc.next());
		int array[] = new int[num];
		for(int i = 0; i< num;i++){
			array[i] = Integer.parseInt(sc.next());
		}
		System.out.println("Enter the function that you want to preform \n1. MEAN\n2. MODE\n3. MEDIAN");
		int key = sc.nextInt();
		switch(key){
			case 1:
				System.out.println(mean(array));
				break;
			case 2:
				System.out.println(mode(array));
				break;
			case 3:		
				System.out.println(median(array));
				break;
			default:
				System.out.println("Not a part of the options");
		}

	}
}







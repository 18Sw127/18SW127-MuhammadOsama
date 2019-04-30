
class BubbleSort{
	    public static void  bubbleSort(int X[],int D){ //where N is number of elements in an array
		int round,j,temp;
		for(round=1;round<=D-1;round++){        //both loops run till size-1 of array
			for(j=0;j<=(D-1)-round;j++){ 
				if(X[j]>X[j+1]){
					temp=X[j];
					X[j]=X[j+1];
					X[j+1]=temp;
				}
			}
		} //end of outer for
	}
	public static void main(String[]args)
	{
		int arr[]={4,8,1,9,7};
		int a;
		System.out.print("Array before sorting: ");
		for(a=0;a<arr.length;a++){
			System.out.print(arr[a]+" ");
		}
		bubbleSort(arr,5);
		System.out.println();
		System.out.print("Array after sorting: ");
		for(a=0;a<arr.length;a++){
			System.out.print(arr[a]+" ");
		}

	}
}
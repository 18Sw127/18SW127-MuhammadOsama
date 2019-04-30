class LargestElementInArray{
	public static void main(String[]args)
	{
		int []arr=new int[]{5,6,2,9,10,14,12,15,0,4};
		int max=arr[0];
		for(int x=0;x<arr.length;x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		System.out.println("Largest Element in array is "+max);
	}
}
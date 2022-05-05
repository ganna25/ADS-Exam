class Sort{
	void insertion(int a1[],int n){
		
		//System.out.println(n);
		for(int i=n-1;i>=0;i--){
			int s=a1[i];
			int k=i-1;
			while(k>=0 && a1[k]>s){
				a1[k+1]=a1[k];
				k--;
				for(int j=0;j<n;j++){
				System.out.print(a1[j]+" ");
			}
			System.out.println();
			}		
		}
		// for(int i=0;i<a1.length;i++){
			// System.out.print(a1[i]+" ");
		// }
	}
	
	public static void main(String []args){
		Sort s1=new Sort();
		int n=5;
		int a1[]={1,2,4,5,3};
		int a2[]={2,4,6,8,3};
		s1.insertion(a1,5);
		System.out.println();
		s1.insertion(a2,5);
		
	}
}
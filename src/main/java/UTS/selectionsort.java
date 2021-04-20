package UTS_Ardi;

public class UTS {
	public static void selectionsort(int[] A) {
		int smallindex;
		int pass, j, n = A.length;
		int temp;
		
		//index of smallest element in the sublist
		for (pass = 0; pass < n - 1; pass++) { //pass=0; 0<4-T
			smallindex = pass;					//0
			for (j = pass + 1; j < n; j++) {	//j=1; 1<5 /j=2; 2<5
				if (A[j]< A[smallindex]) {		//A[1}<A[0]-6<10-T /A[2]<A[1]-8<6-f
					smallindex = j; //1  /2
				}
			}
		temp = A[pass];
		A[pass] = A[smallindex];
		A[smallindex] = temp;
	}
}
	
public static void tampil(int data)	{
	for (int i = 0; i < data.length; i++) {
		System.out.print(data[i] + " ");
	}
	System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3,10,4,2,8,13};
		C_selectionsort.tampil(A);
		C_selectionsort.selectionsort(A);
		C_selectionsort.tampil(A);
		

	}

}

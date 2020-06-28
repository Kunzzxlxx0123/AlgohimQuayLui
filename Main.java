
public class Main {
	
	static int N = 5;
	static int K = 3;
	static int A[] = new int[K+1];
	static int count = 0;
	
	static void print(){
		for(int j = 1; j <= K; j++){
			System.out.print(A[j] + " ");
		}
	}
	
	static void TRY(int i){
		for(int u = A[i-1]+1; u <= N-K+i; u++){
			A[i] = u;
			if(i == K){
				print();
				System.out.println();
				count++;
			} else {
				TRY(i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i <=K; i++) A[i] = -1;
			A[0] = 0;
			TRY(1);
			
			System.out.println(count);
		
	}
}

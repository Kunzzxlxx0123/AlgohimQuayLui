
public class QuayLuiToHop {
	static int N = 5;
	static int K = 3;
	static int A[] = new int[N+1];
	static int count = 0;
	private static boolean[] visited = new boolean[N+1];

	
	static void print(){
		for(int j = 1; j <= K; j++){
			System.out.print(A[j] + " ");
		}
	}
	
	static void list(){
		for(int v = 0; v < visited.length; v++){
			visited[v] = false;
		}
	}
	
	static void TRY(int i){
		for(int u = 1; u <= N; u++){
			if(visited[u] == false){
				A[i] = u;
				visited[u] = true;
				if(i == K){
					print();
					System.out.println();
					count++;
				} else {
					TRY(i+1);
				}
				visited[u] = false;
			}
			
		}
	}
	
	public static void main(String[] args) {
		list();
			TRY(1);
			System.out.println(count);
		
	}
}


public class QuayLuiQuanHau {
	final int N = 4;
	int x[] = new int[N+1];
	int count = 0;
		
	void print(){
		count++;
		for(int i = 1; i <= N; i++ ){
			System.out.print("(" + i + " " + x[i] + ")" + " ");
		}
		System.out.println("");
	}
	

	boolean Candidate(int i, int c){
		for(int j = 1; j <= i-1; j++){
			if(c == x[j] || (Math.abs(i-j) == Math.abs(c- x[j]))) return false;
		}
		return true;
	}
	
	void TRY(int i){
		for(int c= 1; c <= N; c++){
			if(Candidate(i,c)) // neu co the dat quan hau thu i vao cot c
			{
				x[i] = c;
				if(i==N) print();
				else TRY(i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		QuayLuiQuanHau hau = new QuayLuiQuanHau();
		hau.TRY(1);
	}
	
}

import java.io.*;

class NikiAssignment {

	public static void main(String s[]) {
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			long t = Long.parseLong(br.readLine());
			int n = 0;
			long end_0[] = null;
			long end_1[] = null;
			for (long i = 0 ; i < t ; i++){
				n = Integer.parseInt(br.readLine());
				end_0 = new long[n];
				end_1 = new long[n];
				end_0[0] = end_1[0] = 1;
				for (int j = 1 ; j < n ; j++) {
					end_0[j] = end_1[j-1];						// 0 can only be added to string ending with 1.
					end_1[j] = end_0[j-1] + end_1[j-1];			// 1 can be added to both the string ending with 0 or 1.
				}
				System.out.println("" + (end_0[n-1] + end_1[n-1]));
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
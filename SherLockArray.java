import java.io.*;
public class SherLockArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] zero = br.readLine().split(" ");
        int tc = Integer.parseInt(zero[0]);
        
        while(tc-- >0){
            String[] firstLine = br.readLine().split(" ");
        
            int n = Integer.parseInt(firstLine[0]);
            
            int[] arr = new int[n];
            String[] secondLine = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(secondLine[i]);
            }
            
            int[] prefixSums = new int[n + 1];
            prefixSums[0] = 0;
            
            for(int i = 1; i <= n; i++){
                prefixSums[i] = prefixSums[i-1] + arr[i-1];
            }
            boolean fl = false;
            for(int i = 1; i <= n; i++){
                if(prefixSums[i] == prefixSums[n] - prefixSums[i - 1]){
                    fl = true; break;
                }
            }
            
            if(fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}

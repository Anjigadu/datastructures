/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		while((str=br.readLine())!=null){
			String input[] = str.split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			int s = Integer.parseInt(input[2]);
			int l = Integer.parseInt(input[3]);
			
			int N = n*m;
			char board[] = new char[N+1];
			int dp[] =  new int[N+1];
			Arrays.fill(dp,Integer.MAX_VALUE);
			Arrays.fill(board,'N');
			HashMap<Integer,Integer> ladderMap = new HashMap<Integer,Integer>();
			for(int i=0;i<s;i++){
				String snake[] = br.readLine().split(" ");
				board[Integer.parseInt(snake[0])] = 'S';
			}
			
			for(int i=0;i<l;i++){
				String ladder[] = br.readLine().split(" ");
				if(ladderMap.get(Integer.parseInt(ladder[0]))!=null){
				board[ladderMap.get(Integer.parseInt(ladder[0]))]='N';
				}else{
				board[Integer.parseInt(ladder[1])]='L';	
				}
				ladderMap.put(Integer.parseInt(ladder[1]),Integer.parseInt(ladder[0]));
			}
			

			
			for(int i=1;i<=7 && i<=N;i++){
				if(board[i]!='S'){
					dp[i]=1;
				}
			}
			
			
			for(int i=8;i<=N;i++){
				if(board[i]=='S')
					dp[i] = Integer.MAX_VALUE;
				else{
					int j=1;
					while(j<=6){
						if(board[i-j]!='S')
						dp[i] = Math.min(dp[i-j]+1,dp[i]);
						j++;
					}
				}
				if(board[i]=='L'){
					dp[i] = Math.min(dp[i],dp[ladderMap.get(i)]);
				}
			}
			if(dp[N]==Integer.MAX_VALUE)
			System.out.println("-1");
			else
			System.out.println(dp[N]);
			
			
		}
		
	}
}

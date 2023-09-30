// Java program to find a maximum number X, such
// that a given String can be partitioned
// into X subStrings that are each balanced
import java.util.*;
class MaxBalancedStringFormation{
static int BalancedPartition(String str, int n)
{
	if (n == 0)
		return 0;
	int r = 0, l = 0;
	int ans = 0;
	for(int i = 0; i < n; i++)
	{
	if (str.charAt(i) == 'R')
	{
		r++;
	}
	else if (str.charAt(i) == 'L')
	{
		l++;
	}
	if (r == l)
	{
		ans++;
	}
	}
	return ans;
}
public static void main(String[] args)
{
	String str = "LLRRRLLRRL";
	int n = str.length();
	System.out.print(BalancedPartition(str, n) + "\n");
}
}

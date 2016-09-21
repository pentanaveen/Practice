package com.practice.string;

public class PrimeNumers {
	public static void main(String[] args) {
		    int i = 1000000000;
		    int m=2;
		    int n=1;
		    for (int j = 2; j < i; j++) {
		    	int l=0;
		    	if(j%25==0)
		    	{
		    		if(j%100==0)
		    		{
		    			m++;
		    		}
		    		if(j%1000==0)
		    		{
		    			m++;
		    		}
		    		m++;
		    	}
		        if (j % 2 != 0) {
		            for (int k = 2; k < j/m; k++) {
		                if (j % k == 0) {
		                    l++;
		                }
		            }
		            if (l < 1) {
		                n++;
		            }
		            if(n==900)
		            {
		            	System.out.print(j);
		            }
		        }
		    }
		}
	}
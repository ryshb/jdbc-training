package com.visa.prj.util;

import java.util.Arrays;

public class ArrayUtil {
 public static int getSum(int[] elems) {
	 
	 int sum=0;
	 for(int i: elems) {
		 sum+=i;
	 }
	 return sum;
 }
 public static int getCount(int[] elems, int no) {
	 int cnt=0;
	 for(int i:elems) {
		 if(i==no) {
			 cnt++;
		 }
	 }
	 return cnt;
 }
 public static void sort(int[] elems) {
	 Arrays.sort(elems);
 }
 
}

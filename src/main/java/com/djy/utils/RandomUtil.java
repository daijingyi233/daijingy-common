package com.djy.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
	//TODO 实现代码
		Random r=new Random();
		int num = r.nextInt(max-min+1)+min;
		return num;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
	//TODO 实现代码
		HashSet<Integer> set=new HashSet();
		int[] sets=new int[subs];
		while(set.size()!=subs){
			set.add(random(min, max));
		}
		int num=0;
		for (Integer s : set) {
			sets[num]=s;
			num++;
		}
		return sets;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
	//TODO 实现代码
		char[] zf={'1','2','3','4','5','6','7','8','9','0','q','a','z','x','s','w','e','d','c','v','f','r','t','g','b','n','h','y','u','j','m','i','k','l','o','p','Q','A','Z','X','S','W','E','D','C','V','F','R','T','G','B','N','H','Y','U','J','M','I','K','L','O','P'};
		int i = random(0, zf.length-1);
		return zf[i];
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
	//TODO 实现代码
		String str="";
		for (int i=1;i<=length;i++) {
			char zf = randomCharacter();
			str+=zf;
		}
		return str;
	}

}

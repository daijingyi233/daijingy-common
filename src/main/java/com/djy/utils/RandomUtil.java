package com.djy.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
	//TODO ʵ�ִ���
		Random r=new Random();
		int num = r.nextInt(max-min+1)+min;
		return num;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
	//TODO ʵ�ִ���
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
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
	//TODO ʵ�ִ���
		char[] zf={'1','2','3','4','5','6','7','8','9','0','q','a','z','x','s','w','e','d','c','v','f','r','t','g','b','n','h','y','u','j','m','i','k','l','o','p','Q','A','Z','X','S','W','E','D','C','V','F','R','T','G','B','N','H','Y','U','J','M','I','K','L','O','P'};
		int i = random(0, zf.length-1);
		return zf[i];
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
	//TODO ʵ�ִ���
		String str="";
		for (int i=1;i<=length;i++) {
			char zf = randomCharacter();
			str+=zf;
		}
		return str;
	}

}

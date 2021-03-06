package com.djy.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class StringUtil {
	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src){
	//TODO ʵ�ִ���
		//true��ֵ falseûֵ
		return src!=null&&!"".equals(src);
	}
	//����2���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)�Ϳո�Ҳ��ûֵ (5��)
	public static boolean hasText(String src){
	//TODO ʵ�ִ���
		//true��ֵ falseûֵ
		return src!=null&&!"".equals(src.replace(" ",""));
	}
	//����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length){
	//TODO ʵ�ִ���
		Random r=new Random();
		int highPos, lowPos;
		String str ="";
		byte[] bArr=new byte[2];
		for (int i=1; i <=length;i++) {
			highPos=(176+Math.abs(r.nextInt(71)));//ȥ��,0xA0��ͷ,�ӵ�16����ʼ
			r=new Random();
			lowPos=161+Math.abs(r.nextInt(94));//λ��,0xA0��ͷ,��Χ��1-94��
			bArr[0]=(new Integer(highPos)).byteValue();
			bArr[1]=(new Integer(lowPos)).byteValue();
			try {
				str+=new String(bArr,"GB2312");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return str;
	}
	//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName(){
	//TODO ʵ�ִ���
		String[] sex={"��","Ǯ","��","��",
					  "��","��","֣","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","ʩ","��",
					  "��","��","��","��",
					  "��","κ","��","��",
					  "��","л","��","��",
					  "��","ˮ","�","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "³","Τ","��","��",
					  "��","��","��","��",
					  "��","��","Ԭ","��",
					  "ۺ","��","ʷ","��",
					  "��","��","�","Ѧ",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","ʱ","��",
					  "Ƥ","��","��","��",
					  "��","��","Ԫ","��",
					  "��","��","ƽ","��",
					  "��","��","��","��",
					  "Ҧ","��","տ","��",
					  "��","ë","��","��",
					  "��","��","��","�",
					  "��","��","��","��",
					  "̸","��","é","��",
					  "��","��","��","��",
					  "��","ף","��","��",
					  "��","��","��","��",
					  "ϯ","��","��","ǿ",
					  "��","·","¦","Σ"
					  ,"��","ͯ","��","��",
					  "÷","ʢ","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","֧","��",
					  "��","��","¬","Ī",
					  "��","��","��","��",
					  "��","��","Ӧ","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","ʯ",
					  "��","��","ť","��",
					  "��","��","��","��",
					  "��","½","��","��",
					  "��","��","�","��",
					  "��","�L","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","ɽ","��",
					  "��","��","�","��",
					  "ȫ","ۭ","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","б","��","��",
					  "��","��","��","��",
					  "��","ղ","��","��",
					  "Ҷ","��","˾","��",
					  "۬","��","��","��",
					  "ӡ","��","��","��",
					  "��","ۢ","��","��",
					  "��","��","��","��",
					  "׿","��","��","��",
					  "��","��","��","��",
					  "��","��","��","˫",
					  "��","ݷ","��","��",
					  "̷","��","��","��",
					  "��","��","��","��",
					  "Ƚ","��","۪","Ӻ",
					  "�S","�","ɣ","��",
					  "�","ţ","��","ͨ",
					  "��","��","��","��",
					  "ۣ","��","��","ũ",
					  "��","��","ׯ","��",
					  "��","��","��","��",
					  "Ľ","��","��","ϰ",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","»","��","��",
					  "ŷ","�","��","��",
					  "ε","Խ","��","¡",
					  "ʦ","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","ɳ","ؿ",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","��","Ȩ","��",
					  "��","��","��","��",
					  "��","��","��","��",
					  "��","۳","Ϳ","��",
					  "��","˧","��","��",
					  "��","��","��","��",
					  "��","Ĳ","��","٦",
					  "��","��","ī","��",
					  "��","��","��","��",
					  "��","١","��","��",
					  "��","��",
					  "��ٹ","˾��","�Ϲ�",
					  "ŷ��","�ĺ�","���",
					  "����","����","����",
					  "�ʸ�","ξ��","����",
					  "�̨","��ұ","����",
					  "���","����","����",
					  "̫��","����","����",
					  "����","��ԯ","���",
					  "����","����","����",
					  "Ľ��","����","����",
					  "˾ͽ","˾��","آ��",
					  "˾��","�ӳ�","���",
					  "��ľ","����","����",
					  "���","����","����",
					  "����","�ذ�","�й�",
					  "�׸�","����","�θ�",
					  "����","����","����",
					  "����","����","΢��",
					  "����","����","����",
					  "����","�Ϲ�"};
		String name="";
		String xing="";
		String ming="";
		Random r=new Random();
		int i = r.nextInt(sex.length);
		xing=sex[i];
		int max=4-xing.length();
		int min=1;
		ming = randomChineseString(r.nextInt(max-min+1)+min);
		name=xing+ming;
		return name;
	}

}

package date20160308_javaCommonBuild;

public class NuberOrStringCheck {
	//�޲����Ĺ��캯��
	NuberOrStringCheck(){}

	/**
	 * ����: 2016-03-08
	 * ���ܣ� ����ڿ��������е�һЩCheck����
	 * 
	 */
	public static boolean  checkInt(final Integer value){
		/**
		 * ����value��һ��Integer���͵������򷵻�true���򷵻�false��
		 * 
		 */
		return (value instanceof Integer) ? true : false;
	}
	
	/**
	 * ����һ���ַ����ĳ���
	 * @return
	 */
	public static long getLengthOfString(final String str){
		//�൱�ڸ�дjava��length����
		return str.length();
	}
	
	/**
	 * �ж�һ���ַ����ǲ���Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isBlankOrEmpty(final String str){
		return (str == null) || (str.length() == 0);
	}
	
	/**
	 * �ж��ַ����ǲ���Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(final String str){
		if(str == null){
			return false;
		}
		return true;
	}
	
	/**
	 * �ж�һ�����ǲ�������
	 * @param value
	 * @return
	 */
	public static boolean isOdd(final int value){
		return (value % 2 != 0)? true:false;
	}
	
	/**
	 * �ж�һ�����ǲ���ż��
	 * @param value
	 * @return
	 */
	public static boolean isEven(final int value){
		return (value % 2 != 0)? false:true;
	}
	
	
}

package com.java.oop.base.generic;

public class GenericFun{
	public static void main(String[] args) {
		
	}
	
	

}
class GenericClass<T>{
	private T key;
	
	
	public GenericClass(T key) {
		
	}
	public GenericClass() {
		
	}
	
    //��Ȼ�ڷ�����ʹ���˷��ͣ������Ⲣ����һ�����ͷ�����
    //��ֻ������һ����ͨ�ĳ�Ա������ֻ�������ķ���ֵ���������������Ѿ��������ķ��͡�
    //��������������вſ��Լ���ʹ�� T ������͡�
	public T getKey() {
		return key;
	}
    /*
             * ���������������ģ��ڱ��������������ʾ�����Ĵ�����Ϣ"cannot reslove symbol E"
             * ��Ϊ����������в�δ��������E��������ʹ��E���βκͷ���ֵ����ʱ�����������޷�ʶ��
    */
//     public E setKey(E key){
//         this.key = keu
//    }
	
  /** 
     * �����һ�������ķ��ͷ�����
     * ������public�뷵��ֵ֮���<T>�ز����٣����������һ�����ͷ���������������һ������T
     * ���T���Գ�����������ͷ���������λ��.
     * ���͵�����Ҳ����Ϊ������ 
     *    �磺public <T,K> K showKeyName(Generic<T> container){
     *        ...
     *        }
   */
	public <T> String showKeyName(T name) {
		
		return null;
		
	}
	
	//��Ҳ����һ�����ͷ����������һ����ͨ�ķ�����ֻ��ʹ����Generic<Number>������������βζ��ѡ�
    public void showKeyValue1(GenericClass<Number> obj){
        
    }
    //��Ҳ����һ�����ͷ�������Ҳ��һ����ͨ�ķ�����ֻ����ʹ���˷���ͨ���?
    //ͬʱ��Ҳӡ֤�˷���ͨ����½��������ģ�?��һ������ʵ�Σ����Կ���ΪNumber��������ĸ���
    public void showKeyValue2(GenericClass<?> obj){
        
    }
    /**
    * ���������������ģ���������Ϊ������ʾ������Ϣ��"UnKnown class 'E' "
    * ��Ȼ����������<T>,Ҳ����������һ�����Դ����͵����͵ķ��ͷ�����
    * ����ֻ�����˷�������T����δ������������E����˱���������֪������δ���E������͡�
   public <T> T showKeyName(Generic<E> container){
       ...
   }  
   */
    
    /**
     * �������Ҳ��������ģ���������Ϊ������ʾ������Ϣ��"UnKnown class 'K' "
     * ���ڱ�������˵T������Ͳ�δ��Ŀ������������˱���Ҳ��֪������α�������ࡣ
     * ������Ҳ����һ����ȷ�ķ��ͷ���������
  */   
//    public void showkey(K genericObj) {
//    	
//    }
    
}



/*==================
	Record.java
   - 인터페이스
==================*/

package com.test.spr;

public interface Record
{
	// 뒤에 선언(정의) 부분 {} 안썼으므로 추상메소드
	// All 추상메소드 → 인터페이스
	public void setKor(int kor);
	public int getKor();
	
	public void setEng(int eng);
	public int getEng();
	
	public void setMat(int mat);
	public int getMat();
	
	public int getTotal();
	
	public double getAvg();
	
}

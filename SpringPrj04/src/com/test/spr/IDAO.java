/*===================
  IDAO.java
  - 인터페이스
===================*/

package com.test.spr;

import java.sql.SQLException;
import java.util.List;

public interface IDAO
{
	// 메소드 오버라이드에서 예외를 추가할 수가 없다. 미리 인터페이스에서 예외를 등록해야한다.
	public List<MemberDTO> list()  throws ClassNotFoundException, SQLException;
	
	
}

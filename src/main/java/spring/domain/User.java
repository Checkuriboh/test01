package spring.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * FileName : User.java  
 * �� User �� ������ ���� Value Object (�����ΰ�ü,�����Ͻ���ü)
 * �� USERS TABLE �� 1���� ROW �� ������ ���´�.  
*/

//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
@Builder
public class User implements Serializable {

	///Field
	@NonNull
    private String userId; 			// ȸ�� ID 
	@NonNull
    private String userName;		// ȸ�� �̸� 
    private String password;     // ��й�ȣ 
    private Integer age;    			// ���� :: Integer wrapper class ��� :: ���� �뵵 Ȯ��  
    private int grade;    				// ��� :: int primitive ��� :: :: ���� �뵵 Ȯ�� 
    private Timestamp regDate; 	// �������� 
    //private Timestamp regDate	= new Timestamp(new Date().getTime()); // ��������
    private boolean active;
    
}//end of class
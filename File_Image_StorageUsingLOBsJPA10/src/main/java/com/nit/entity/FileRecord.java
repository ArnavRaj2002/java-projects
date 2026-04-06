package com.nit.entity;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="FileRecord_Table")
public class FileRecord {
@Id
@SequenceGenerator(name ="seq_1",sequenceName ="LOB_Seq",initialValue=77,allocationSize =3)
@GeneratedValue(generator ="seq_1",strategy =GenerationType.SEQUENCE)
private Long	id;
 
private String	fileName;
@NonNull
@Lob
private String fileText; 
//private char[] fileText; //(CLOB)
@NonNull
@Lob
private byte[] fileImage; //(BLOB)


}

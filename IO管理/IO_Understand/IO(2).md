# ̸̸FileReader��FileWriter
> ��������FileReader��FileWriter������Ϊ������Զ��Ծ�����ʹ�á�
> ���ǵ����þ��ǶԱ����ļ����ı�������������ķ�װ������˼�壬FileReader��������������Ĵ����ȵȣ�FileWriter�������������Ĵ����ȵȡ�
####FileReader
> FileReader�ĸ�����InputStreamReader,InputStreamReader�ĸ�����Reader
1.�������ϴ��룺
```java 
import java.io.*;

/*
 FileReader ��ʹ��
 */
public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null; // ע��ȫ�ֱ����İ��ţ��������������fr�Ĳ�����close�ı�������Ϊtry��finally�����������

		try {
			fr = new FileReader("newFile.txt");       //�ӵ�ǰ�ĵ���ȡnewFile.txt�ļ���������
			
			int ch=0;                                //����read()�ķ���ֵ���ַ���ASCIIֵ
			while ((ch=fr.read() )!= -1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			throw new RuntimeException("��ȡʧ��");
		} finally {
			try {
				if (fr != null)
					fr.close();             
			} catch (IOException e) {
				throw new RuntimeException("�ر�������ʧ��");
			}

		}
	}

}

```
-----------
2.```java
FileReader fr = null; // ע��ȫ�ֱ����İ��ţ��������������fr�Ĳ�����close�ı�������Ϊtry��finally�����������

		try {
			fr = new FileReader("newFile.txt");
			
			int ch=0;
			while ((ch=fr.read() )!= -1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			throw new RuntimeException("��ȡʧ��");
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				throw new RuntimeException("�ر�������ʧ��");
			}


```
��������ʽ���ܻ�ӭ���������������
```java
			int ch=0;
			while ((ch=fr.read() )!= -1) {
				System.out.print((char)ch);
			}
```
----------
####FileWriter
> FileWriter�ĸ�����OutputStreamReader,OutputStreamReader�ĸ�����Writer
1.`FileWriter fw=new FileWriter("Demo.txt");`������ĺ������ڵ���ǰ�ĵ������������Demo.txt�ļ������ᴴ��һ��Demo.txt�ļ�������
ֱ����Demo.txt�ļ��н��в���������ԭ�������ݡ�
2.����ķ���ϸ��������Ĵ����п������֡�
```java
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) {
		
		FileWriter fw=null;        //ע�ⶨ��Ϊȫ�ֱ��������ƣ�����ʹ�����͹ر����ڲ�ͬ�Ĵ�����С�
		
		
		try{
			
			fw=new FileWriter("newFile.txt");       //�����������������ļ�����newFile.txt��ע�⸲������
			fw.write("abcde");          //�򻺳���д��abcde��ע�⣬����û��д���ļ���
			
			fw.flush();
			//����ʹ��fw.flush();����ˢ�»�����������close�����ĵ��ÿ������flush����

			fw.write("    nihao"); 
		}
		catch(IOException e){
			throw new RuntimeException("����ʧ��");
		}
		finally{
			
			try{
				if(fw!=null)          
					fw.close();        //�ر������
			}catch(IOException e){
				throw new RuntimeException("�ر������ʧ��");
			}
			
			
		}
	}

}

```

3.ע���flush()��close()������
> ��ʵ�ܼ򵥣�flush()��������ˢ�»���������close()���������ڹر����������ڹر�֮ǰ�������flush()������ˢ�»�������
4.FileWriter(String name,boolean append);���ִ�����ʽ���Ըı��Ƿ񸲸��ļ����ݣ�boolean append Ϊtrueʱ�������ļ�������д�����򣬸��ǡ�

/*����IO�ӿ��е�FileReader��FileWriter,BufferedReader,BufferedWriter
 ʵ�ֶ��ļ��ĸ���
 */
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) {
		
		FileWriter fw=null;
		
		
		try{
			
			fw=new FileWriter("newFile.txt");
			fw.write("abcde");
		}
		catch(IOException e){
			throw new RuntimeException("����ʧ��");
		}
		finally{
			
			try{
				if(fw!=null)
					fw.close();
			}catch(IOException e){
				throw new RuntimeException("�ر������ʧ��");
			}
			
			
		}
	}

}

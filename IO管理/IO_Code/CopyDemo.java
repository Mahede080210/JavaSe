
/*����IO�ӿ��е�FileReader��FileWriter,BufferedReader,BufferedWriter
 ʵ�ֶ��ļ��ĸ���
 */
import java.io.*;

public class CopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader bufR=null;
		FileWriter fw=null;
		BufferedWriter bufW=null;
		
		
		try{
			fr=new FileReader("F:\\java����\\JavaSE\\������List,Set,Map��\\Collections������\\Home\\JavaCode\\Person.class");
			fw=new FileWriter("CopyMapEnter.txt");
			bufR=new BufferedReader(fr);
			bufW=new BufferedWriter(fw);
			
			String target=bufR.readLine();
			while(target!=null)
			{
				bufW.write(target);
				bufW.newLine();
				bufW.flush();
			}
		}
		catch(IOException e){
			throw new RuntimeException("����ʧ��");
		}
		finally{
			try{
				if(bufR!=null)
					bufR.close();
			}catch(IOException e){
				throw new RuntimeException("�ر�������ʧ��");
			}
			try{
				if(bufW!=null)
					bufW.close();
			}catch(IOException e){
				throw new RuntimeException("�ر������ʧ��");
			}
		}
	}

}
			
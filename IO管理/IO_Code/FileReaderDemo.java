import java.io.*;

/*
 FileReader ��ʹ��
 */
public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		}
	}

}

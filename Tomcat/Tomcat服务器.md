# [Tomcat ���](http://www.cnblogs.com/jeacebolgs/p/6580428.html)
```
Tomcat ����SUN ��˾��JSWDK��JavaServer Web DevelopmentKit ,��SUN��˾�Ƴ���С��Servlet/JSP��
�Թ��ߣ��Ļ����Ϸ�չ������һ�������Servlet������Tomcat������ȫ��java���Ա�д��

Servlet��һ�������ڷ������ϵ�С������������еĵ������ص㣺

1���ṩ�˿ɱ����������ز�ִ�еĳ�����룬�����������Կͻ��˵�����

2��Servlet����������֧��java��

3��Servlet��������������������ڷ������ˣ����Բ���������Ƿ�֧��java�������������servlet��

Tomcat��ΪServlet����������������ͼһ
```
![ͼһ](http://images2015.cnblogs.com/blog/1109265/201703/1109265-20170319124125448-1428558704.png)
```
Servlet �Ĺ淶�涨Servlet�������������ڻ���HTTPЭ���Web�������ϣ������������ڻ�������Ӧ��Э
��ķ������ϡ�������ĿǰServlet��Ҫ������Web�������ϣ�������չWeb�������Ĺ��ܡ�Servlet�淶��
����Servlet������Ӧ�ͻ���������ض���Servlet���������£�

1���ͻ�����Ҫ������ض���Servlet������

2��Servlet �������յ��ͻ����󲢽�����

3��Servlet ��������һ��ServletRequest������ServletRequest�����а����˿ͻ�������Ϣ��������
�ڿͻ�����Ϣ��������ͷ���������ģ��Լ��ͻ�����IP��ַ�ȡ�

4��Servlet��������һ��ServletResponse����

5��Servlet �������ÿͻ��������Servlet��service���񷽷������Ұ�ServletRequst�����
ServletResponse������Ϊ���������÷��񷽷���

6��Servlet��ServletRequest�����пɻ�ȡ�ͻ���������Ϣ��

7��Servlet����ServletResponse������������Ӧ�����

8��Servlet������Servlet���ɵ���Ӧ������͸��ͻ���

 Tomcat�������ͼ��
```
![ͼ��](http://images2015.cnblogs.com/blog/1109265/201703/1109265-20170319132358073-524647167.png)
```
1��<Server> Ԫ�أ���������Servlet�����������Tomcat�Ķ���Ԫ�ء���<Server>Ԫ���п��԰���һ
�����߶��<Service>Ԫ�ء�

2��<Service>Ԫ�أ�����һ��<Engine>Ԫ�أ��Լ�һ������<Connector>Ԫ�أ���Щ<Connector>ԭ��
����һ��<Engine>Ԫ�ء�

3��<Connector>Ԫ�أ�����Ϳͻ�����ʱ�佻���������������տͻ������Լ���ͻ�������Ӧ�����

4��<Engine>Ԫ�أ�ÿ��<Service>ֻ����һ��<Engine>Ԫ�ء�<Engine>Ԫ�ش�����ͬһ��<Service>����
��<Contector>Ԫ�ؽ��յ��Ŀͻ�����

5��<Host>Ԫ�أ���һ��<Engine>Ԫ���п��԰������<Host>Ԫ�ء�ÿ��<Host>Ԫ�ض�����һ������������
�����԰���һ������WebӦ�á�

6��<Context>Ԫ�أ�ʹ����Ƶ����Ԫ�ء�ÿ��<Context>Ԫ�ش��������������������ϵĵ���WebӦ�á�
��һ��<Host>Ԫ���п��԰������<Context>Ԫ�ء�
```
-----------------------------------------

### Tomcat��Ϊ������Web���������������У�Servlet���������ΪWeb�������е�һ���ֶ����ڣ�
����Tomcat��Ĭ�Ϲ���ģʽ��
![](http://images2015.cnblogs.com/blog/1109265/201703/1109265-20170319133918151-1547402490.png)

















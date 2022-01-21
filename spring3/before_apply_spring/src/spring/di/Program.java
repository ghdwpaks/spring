package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.*;
import spring.di.ui.*;

public class Program {

	public static void main(String[] args) {
		/* Bean ���� �����ϴ� ������� �ڵ� ���� ����
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		//ExamConsole console = context.getBean(ExamConsole.class);
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
		
	}

}

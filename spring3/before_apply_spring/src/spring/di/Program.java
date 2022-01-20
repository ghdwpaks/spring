package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.*;
import spring.di.ui.*;

public class Program {

	public static void main(String[] args) {
		/* Bean 에서 지시하는 방법으로 코드 변경 예정
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
	}

}

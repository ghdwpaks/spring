package spring.di;

import java.util.ArrayList;
import java.util.List;

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
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		ExamConsole console_Newlec = (ExamConsole) context.getBean("exam");
		System.out.println("res : "+console_Newlec.toString());
		
		
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		
		//System.out.println("===================");
		//for (Exam e : exams) System.out.println(e);
		
		
	}

}
 
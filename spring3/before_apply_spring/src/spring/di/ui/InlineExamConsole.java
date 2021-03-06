package spring.di.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {

	@Autowired(required = false)
	//@Autowired
	@Qualifier("exam")
	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	

	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
		System.out.println("overloaded constructor");
	}




	@Override
	public void print() {
		
		// TODO Auto-generated method stub
		if(exam==null)
			System.out.println("total is 0, avg is 0\n");
		
		else 
			System.out.println("total is "+exam.total()+", avg is "+exam.avg()+"\n");
	}
	



	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}

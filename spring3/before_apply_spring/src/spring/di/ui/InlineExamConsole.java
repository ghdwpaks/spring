package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}




	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("total is "+exam.total()+", avg is "+exam.avg()+"\n");
	}
	



	@Autowired
	@Qualifier("exam")
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}

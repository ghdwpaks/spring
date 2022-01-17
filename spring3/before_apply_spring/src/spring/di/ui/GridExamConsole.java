package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole{

	private Exam exam;
	
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\ttotal\tavg");
		System.out.printf("\t%3d\t%3.2f\n",exam.total(),exam.avg());
	}
	

}

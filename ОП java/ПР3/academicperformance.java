public class academicperformance {	

	    private String Id_studenta;
	    private String Students;
	    private String Fam;
	    private String Name;
	    private String Groupa;
	    private String Department;
	    private String Discipline;
	    private String Mark;
	    private String NameTeacher;
	    
	    void setId_studenta(String Id_studenta){

	        this.Id_studenta=Id_studenta;
	    }

	    void  setStudents(String Students){

	        this.Students=Students;
	    }

	    void setFam (String Fam){

	        this.Fam=Fam;
	    }

	    void setName (String Name){
	        this.Name=Name;
	    }

	    void setGroupa(String Groupa){

	        this.Groupa = Groupa;
	    }
	    
	    void setDepartment(String Department){

	        this.Department = Department;
	    }
	    
	    void setDiscipline(String Discipline){

	        this.Discipline = Discipline;
	    }
	    
	    void setMark(String Mark){

	        this.Mark = Mark;
	    }
	    
	    void setNameTeacher(String NameTeacher){

	        this.NameTeacher = NameTeacher;
	    }
	    	    

	    public String toString(){
	      return "Student performance:\n" + "Record book number - " + this.Id_studenta + "\nStudent - "+ this.Students + "\nSurname - " + this.Fam + "\nName: " + this.Name + "\nGroup - " + this.Groupa + "\nDepartment - " + this.Department + "\nDiscipline - " + this.Discipline + "\nMark - " + this.Mark + "\nNameTeacher - " + this.NameTeacher;
	    }
}

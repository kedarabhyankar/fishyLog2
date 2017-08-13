package fishyClock2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fishyRegistrationToCSV {

	String firstName;
	String lastName;
	String studentID;
	private static final String comma_delimeter = ",";
    private static final String new_line_delimeter = "\n";
    private static final String file_header = "ID,Last Name,First Name";



	public fishyRegistrationToCSV(String studentID, String LastName, String firstName) {
		this.firstName = firstName;
		this.lastName = LastName;
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void passToCSV() {
		FileWriter filewriter = null;
		try {
			filewriter = new FileWriter("userbase.csv");
			filewriter.append(file_header.toString());
			filewriter.append(new_line_delimeter);
			filewriter.append(studentID);
			filewriter.append(comma_delimeter);
			filewriter.append(lastName);
			filewriter.append(comma_delimeter);
			filewriter.append(firstName);
			filewriter.append(new_line_delimeter);
			System.out.println("CSV File created or written to successfully!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("There's an error with passToCSV. Check the error message.");
			e.printStackTrace();
		}finally
		{
			try{
				filewriter.flush();
				filewriter.close();
			}catch(IOException e){
				System.out.println("there was an error flushing or closing the filewriter. Check the error message.");
				e.printStackTrace();
			}
		}
	}

}

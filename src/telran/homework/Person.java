package telran.homework;

public class Person {
private long id;
private int birthYear;
private String email;
public Person(long id, int birthYear, String email) {
	setId(id);
	setbirthYear(birthYear);
	setEmail(email);
	
}
public long getId() {
	return id;
}
public int getBirthYear() {
	return birthYear;
}
public String getEmail() {
	return email;
}
public void setId(long id) {
	this.id = id;
}
public void setbirthYear(int birthYear) {
	this.birthYear = birthYear;
}
public void setEmail(String email) {
	this.email = email;
}

}

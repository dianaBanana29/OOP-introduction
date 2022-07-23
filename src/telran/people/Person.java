package telran.people;

import java.util.regex.Pattern;

public class Person implements Comparable<Person>{
public long id;
private int birthYear;
private String email;
private final String REGEX = "^[\\w.-]+@[\\w.]+\\.[a-zA-Z]{2,}";
Pattern pattern = Pattern.compile(REGEX);
public Person(long id, int birthYear, String email) {
	this.id=id;
	this.birthYear = birthYear;
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

public void setEmail(String email) {
	if(email!= null) {
	
     	if (!pattern.matcher(email).matches()) {
	          
     		throw new IllegalArgumentException(String.format("%s - wrong e-mail",email));
     	}
	}
     	this.email = email;
}
@Override
public int compareTo(Person o) {
	
	return Long.compare(this.id, o.id);
}

}

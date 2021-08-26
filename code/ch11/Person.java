public class Person
{
	public static int THIS_YEAR = 2021;

	public String name;
	public char gender;
	public int birthYear;
	public int deathYear;
	
	/*
	 * Creates a Person with the specified name, gender, birth, and death years.
	 * @param name The person's name
	 * @param gender A character, either M or F
	 * @param birth The year of birth
	 * @param death The year of death; zero if person is still alive
	 */
	public Person( String name, char gender, int birth, int death )
	{
		this.name = name;
		this.gender = gender;
		this.birthYear = birth;
		this.deathYear = death;
	}
	
	/*
	 * Creates a Person with the specified name, gender, and birth years.
	 * @param name The person's name
	 * @param gender A character, either M or F
	 * @param birth The year of birth
	 * This constructor sets the death year to zero, implying that the
	 * Person is still alive.
	 */
	public Person( String name, char gender, int birth )
	{
		this( name, gender, birth, 0 );
	}
	
	/*
	 * Return the Person's age.
	 * @return the Person's age
	 * If the person is still alive, this method uses the
	 * THIS_YEAR constant to figure out the age; if the person
	 * is dead, it returns the person's age at death.
	 */
	public int calculateAge( )
	{
		int age;
		if (deathYear == 0)
		{
			age = THIS_YEAR - birthYear;
		}
		else
		{
			age = deathYear - birthYear;
		}
		return age;
	}
	
	/*
	 * Returns a string representation of this Person.
	 * @return a string representation of this Person
	 * The string has the form:
	 * name [gender] birth-death
	 * (death year is not displayed if person is still alive)
	 */
	public String toString( )
	{
		String str;
		
		str = name + " [" + gender + "] " + birthYear + "-";
		if (deathYear != 0)
		{
			str += deathYear;
		}
		return str;
	}
}


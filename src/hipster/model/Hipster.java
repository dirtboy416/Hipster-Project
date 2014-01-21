package hipster.model;
/**
 * Creates the Hipster object.
 * @author Jake Wahlin
 *@version 1.2 20/11/13 Added getters/setters, overloaded constructor for additional Hipsters, documentation comments.
 */
public class Hipster
{
	/**
	 * The name of the hipster.
	 */
private String name;
/**
 * The type of the Hipster.
 */
private String hipsterType;
/**
 * The Hipstes catch phrase.
 */
private String hipsterPhrase;
/*
 * The collection of the Hipster's books.
 */
private String [] hipsterBooks;
/**
 * Creates a default Hipster object with values based on me.
 */

public Hipster()

{
	hipsterBooks = new String[5];
	name = "Jake";
	hipsterType= "Student hipster";
	hipsterPhrase = "Snappy";
	fillTheBooks();
}
/**
 * Fills the the variables for the book method.
 */
private void fillTheBooks()
{
	hipsterBooks[0] = "Physics";
	hipsterBooks[1] = "Jake The Snake";
	hipsterBooks[2] = "Magic school bus";
	hipsterBooks[3] = "Elmo";
	hipsterBooks[4] = "Dude where's my car";
}
/**
 * Creates a hipster object with the specific parameters to fill in the component data members.
 * @param name
 * @param hipsterType
 * @param hipsterPhrase
 * @param hipsterBooks
 */

public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
{
	this.name = name;
	this.hipsterBooks = hipsterBooks;
	this.hipsterPhrase = hipsterPhrase;
	this.hipsterType = hipsterType;
}
/**
 *  Getter for the name method.
 * @return
 */
public String getName()
{
	
	return name;
}
/**
 *  Setter for the name method.
 * @param name
 */
public void setName(String name)
{
	
	this.name = name;
}
/**
 * Getter for the Hipstertype method.
 * @return
 */
public String getHipsterType()

{
	
	return hipsterType;
}
/**
 *  Setter for the HipsterType method.
 * @param hipsterType
 */
public void setHipsterType(String hipsterType)

{
	this.hipsterType = hipsterType;
}
/**
 * 
 * Getter for the getHipsterPhrase method.
 */
public String getHipsterPhrase()

{
	return hipsterPhrase;
}
/**
 * Setter for the hipsterPhrase method.
 * @param hipsterPhrase
 */
public void setHipsterPhrase(String hipsterPhrase)

{
	this.hipsterPhrase = hipsterPhrase;
}
/**
 * Getter for the HipsterBooks method.
 * @return
 */
public String[] getHipsterBooks()

{
	return hipsterBooks;
}
/**
 * Setter for the HipsterBooks method.
 * @param hipsterBooks
 */
public void setHipsterBooks(String[] hipsterBooks)

{
	this.hipsterBooks = hipsterBooks;
}

}
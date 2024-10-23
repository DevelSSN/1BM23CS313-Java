

/**
 * Class Patient
 */
public class Patient {

	//
	// Fields
	//

	private String id;
	private String name;
	private int phoneNo;
	private int age;
	private String docName;
	
	//
	// Constructors
	//
	public Patient () { };
	
	//
	// Methods
	//


	//
	// Accessor methods
	//

	/**
	 * Set the value of id
	 * @param newVar the new value of id
	 */
	public void setId (String newVar) {
		id = newVar;
	}

	/**
	 * Get the value of id
	 * @return the value of id
	 */
	public String getId () {
		return id;
	}

	/**
	 * Set the value of name
	 * @param newVar the new value of name
	 */
	public void setName (String newVar) {
		name = newVar;
	}

	/**
	 * Get the value of name
	 * @return the value of name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value of phoneNo
	 * @param newVar the new value of phoneNo
	 */
	public void setPhoneNo (int newVar) {
		phoneNo = newVar;
	}

	/**
	 * Get the value of phoneNo
	 * @return the value of phoneNo
	 */
	public int getPhoneNo () {
		return phoneNo;
	}

	/**
	 * Set the value of age
	 * @param newVar the new value of age
	 */
	public void setAge (int newVar) {
		age = newVar;
	}

	/**
	 * Get the value of age
	 * @return the value of age
	 */
	public int getAge () {
		return age;
	}

	/**
	 * Set the value of docName
	 * @param newVar the new value of docName
	 */
	public void setDocName (String newVar) {
		docName = newVar;
	}

	/**
	 * Get the value of docName
	 * @return the value of docName
	 */
	public String getDocName () {
		return docName;
	}

	//
	// Other methods
	//

	/**
	 * @param        id
	 * @param        name
	 * @param        phoneNo
	 * @param        docName
	 */
	public void Patient(String id, String name, int phoneNo, String docName)
	{
	}


}

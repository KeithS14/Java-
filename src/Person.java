/**
 * Person is the class used to initialise a person
 *
 * @author Keith Patrick Scannell
 *
 */


public class Person {
    // variables

    /**
     * The first name of the person
    * */
    private String firstName;
    /**
     * The last name of the person
     * */
    private  String lastName;
    /**
     * The address of the person
     * */
    private  String address;
    /**
     * A persons favourite food - composed of Meat
     * */
    private Meat favouriteFoodM;
    /**
     * A persons favourite food - composed of Vegetable
     * */
    private Vegetable favouriteFoodV;

    @Override
    public String toString(){
        if (getFavouriteFoodM() instanceof Meat){
            return getFirstName()+ " " + getLastName() + ", " + getAddress()+ ", "+getFavouriteFoodM();
        }
        return getFirstName()+ " " + getLastName() + ", " + getAddress()+ ", " +getFavouriteFoodV();
    }
    //constructor

    /**
     *  If favourite food is Meat,
     *  Initialises the persons/applicants name, gender and location
     *
     *
     * @param newFirstName -  the first name of the person
     * @param newLastName - the last name of the person
     * @param newAddress - the address of the person
     * @param favouriteFood - the favourite food of the person - Meat
     * */
    public Person(String newFirstName, String newLastName , String newAddress,Meat favouriteFood){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setAddress(newAddress);
        setFavouriteFoodM(favouriteFood);
    }

    /**
     *  If favourite food is Vegetable,
     *  Initialises the persons/applicants name, gender and location
     *
     * @param newFirstName -  the first name of the person
     * @param newLastName - the last name of the person
     * @param newAddress - the address of the person
     * @param favouriteFood - the favourite food of the person - Vegetable
     * */
    public Person(String newFirstName, String newLastName , String newAddress,Vegetable favouriteFood){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setAddress(newAddress);
        setFavouriteFoodV(favouriteFood);
    }
    // methods

    /**
     * Displays the person's details
     * */
    public void display(){
        if (getFavouriteFoodM() instanceof Meat) {
            System.out.println(getFirstName() + " " + getLastName() + ", Address: " + getAddress() + ", Favourite food: "+ getFavouriteFoodM().getName());
        }
        else{
            System.out.println(getFirstName() + " " + getLastName() + ", Address: " + getAddress() + ", Favourite food: "+ getFavouriteFoodV().getName());

        }
    }


    // Setters and Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Meat getFavouriteFoodM() {
        return favouriteFoodM;
    }

    public void setFavouriteFoodM(Meat favouriteFoodM) {
        this.favouriteFoodM = favouriteFoodM;
    }

    public Vegetable getFavouriteFoodV() {
        return favouriteFoodV;
    }

    public void setFavouriteFoodV(Vegetable favouriteFoodV) {
        this.favouriteFoodV = favouriteFoodV;
    }
}



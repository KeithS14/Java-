/**
 * Meat is the class used to initialise a meat
 *
 * @author Keith Patrick Scannell
 *
 */

public class Meat implements Food {

    /**
     * Name of the meat
     * */
    private String name;
    /**
     * Calories per 100g
     * */
    private int kCal;
    /**
     * Protein in grams per 100g
     * */
    private double protein;
    /**
     * Fat in grams per 100g
    * */
    private double fat;
    /**
     * % of vitamin A
     * */
    private double vitaminA;
    /**
     * % of vitamin B
     * */
    private double vitaminB;
    /**
     * % of vitamin C
     * */
    private double vitaminC;

    @Override
    public String toString(){
        return getName()+ ", " + getKCals() + ", " + getProtein() + ", " +getFat()+", "+getVitaminA()+", "+getVitaminB()+", "+getVitaminC();
    }

    /**
     * Initialises the meat's nutritional values
     *
     * @param name - the name of the meat
     * @param protein - the protein content of the meat
     * @param fat - the fat content of the meat
     * @param vitaminA - the vitamin A % of the meat
     * @param vitaminB - the vitamin B % of the meat
     * @param vitaminC - the vitamin C % of the meat
     * */
    public Meat(String name,int kCal, double protein, double fat, double vitaminA, double vitaminB, double vitaminC){
        setName(name);
        setKCals(kCal);
        setProtein(protein);
        setFat(fat);
        setVitaminA(vitaminA);
        setVitaminB(vitaminB);
        setVitaminC(vitaminC);
    }
    /**
     * Displays the meat's nutritional details
     * */
    public void display() {
        System.out.println("Name: "+getName()+", kCals: "+getKCals()+", Protein: "+getProtein()+", Fat: "+getFat()+", Vitamin A: "+getVitaminA()+", Vitamin B: "+getVitaminB()+", Vitamin C: "+getVitaminC());
    }

    /**
     * Checks if the meat is healthy or not by seeing if the sum of the vitamin percentages
     * is greater than the sum of the kCal and the fat
     *
     * @return true/false
     * */
    public boolean healthy(){
        return getVitaminA() + getVitaminB() + getVitaminC() + getProtein() > getFat();
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKCals() {
        return kCal;
    }
    public void setKCals(int kCal) {
        this.kCal = kCal;
    }

    public double getProtein() {
        return protein;
    }
    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getVitaminA() {
        return vitaminA;
    }
    public void setVitaminA(double vitaminA) {
        this.vitaminA = vitaminA;
    }

    public double getVitaminB() {
        return vitaminB;
    }
    public void setVitaminB(double vitaminB) {
        this.vitaminB = vitaminB;
    }

    public double getVitaminC() {
        return vitaminC;
    }
    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }
}

package EnumTypes;

public enum Planets {
	
	    MERCURY (3.303e+23, 2.4397e6),
	    VENUS   (4.869e+24, 6.0518e6),
	    EARTH   (5.976e+24, 6.37814e6),
	    MARS    (6.421e+23, 3.3972e6),
	    JUPITER (1.9e+27,   7.1492e7),
	    SATURN  (5.688e+26, 6.0268e7),
	    URANUS  (8.686e+25, 2.5559e7),
	    NEPTUNE (1.024e+26, 2.4746e7);
	

	    private final double mass;   //mass of the planet
	    private final double radius; //distance from the surface to the center 
	    public static final double G = 6.67300E-11;// a constant number for calculation
	    
	    
	    Planets(double mass, double radius) {
	        this.mass = mass;
	        this.radius = radius;
	    }//this constructor sets the mass and the radius of the planet
	    
	    
	    
	    double mass() { return mass; }//getter method for private property
	    double radius() { return radius; }//getter method for private property
	    
	    
	    
	    double surfaceGravity() {
	        return G * mass / (radius * radius);// gravity
	    }
	    
	    
	    double surfaceWeight(double otherMass) {
	        return otherMass * surfaceGravity();// weight = m.g
	    }
	

}

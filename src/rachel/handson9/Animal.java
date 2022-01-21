package rachel.handson9;

import java.util.ArrayList;

//import rachel.handson3.StudentHelper;

public class Animal {
    // name of the animal
    private String name;
    float length;
    float height;
    float weight;

    public Animal() {
       name = "";
        length= 0;
        height= 0;
        weight= 0;
    }
// build method makes this private build passing in the values from the builder
   public Animal(AnimalBuilder x) {
        this.name = x.name;
        this.length = x.length;
        this.height = x.height;
        this.weight = x.weight;
    }

// only getters?   
   public String getName() {
       
       return name;
   }

   public float getWeight() {
      
       return weight;
   }

   public float getHeight() {
     
       return weight;
   }

   public float getLength() {
     
       return length;
   }
    //Step 2
   
    public static class AnimalBuilder {
        // mandatory
        private String name;
        private float height;
        private float weight;
        private float length;

        

        public AnimalBuilder(String name, int weight, int height, float length) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.length = length;
        }

       //only setters

        public AnimalBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder setWeight(float weight) {
            this.weight = weight;
            return this;
        }

        public AnimalBuilder setheight(float height) {
            this.height = height;
            return this;
        }

        public AnimalBuilder setLength(float length) {
            this.length = length;
            return this;
        }
        
        //last action to create the desired return
         public Animal build() {
    	return new Animal(this);
    }
    }
}


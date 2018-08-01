public class TestingBuilder {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    public static class Builder{

        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;

        public Builder(int servingSize,int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories){
            this.calories = calories;
            System.out.println(this);
            return this;
        }
        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public TestingBuilder build(){
            return new TestingBuilder(this);
        }

    }
    TestingBuilder(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
    }
    public static void main(String args[]){
        TestingBuilder testingBuilder = new Builder(2,1).build();
        System.out.println(testingBuilder.servingSize +" "+ testingBuilder.servings);
        TestingBuilder testingBuilder1 = new Builder(2,3).calories(2).fat(6).build();
        System.out.println(testingBuilder1.calories+" "+ testingBuilder1.fat);
    }
}

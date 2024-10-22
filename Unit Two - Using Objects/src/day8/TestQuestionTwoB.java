package day8;

public class TestQuestionTwoB {
        public static void main(String[] args) {
            Member john = new Member("John Doe", 101);
            Trainer sarah = new Trainer("Sarah Lee", 5);
            WorkoutPlan strengthTraining = sarah.createWorkoutPlan("Strength Training");

            sarah.assignWorkoutPlan(john, strengthTraining);

            WorkoutPlan johnsPlan = john.getWorkoutPlan();
            System.out.println(johnsPlan.getPlanName() + ", " + johnsPlan.getDifficulty());

            john.cancelWorkoutPlan();

            WorkoutPlan cardioEndurance = sarah.createWorkoutPlan("Cardio Endurance");

            sarah.assignWorkoutPlan(john, cardioEndurance);
            johnsPlan = john.getWorkoutPlan();
            System.out.println(johnsPlan.getPlanName() + ", " + johnsPlan.getDifficulty());

            WorkoutPlan yogaFlexability = sarah.createWorkoutPlan("Yoga Flexability");
            john.changeWorkoutPlan(yogaFlexability);

            johnsPlan = john.getWorkoutPlan();
            System.out.println(johnsPlan.getPlanName() + ", " + johnsPlan.getDifficulty());



        
        
        }
    }
    

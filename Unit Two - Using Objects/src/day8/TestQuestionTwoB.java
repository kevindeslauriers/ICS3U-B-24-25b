package day8;

public class TestQuestionTwoB {
        public static void main(String[] args) {
            // 1. Create a Member called john
            Member john = new Member("John Doe", 101);
    
            // 2. Create a Trainer called sarah
            Trainer sarah = new Trainer("Sarah Lee", 5);
    
            // 3. Create a Workout Plan called "Strength Training"
            WorkoutPlan strengthTraining = sarah.createWorkoutPlan("Strength Training");
    
            // 4. Assign the Workout Plan to John
            sarah.assignWorkoutPlan(john, strengthTraining);
    
            // 5. Print John's current workout plan
            WorkoutPlan johnsPlan = john.getWorkoutPlan();
            System.out.println("John's workout plan: " + johnsPlan.getPlanName() + " (" + johnsPlan.getDifficulty() + ")");
    
            // 6. John cancels the workout plan
            john.cancelWorkoutPlan();
    
            // 7. Create a new workout plan called "Cardio Endurance"
            WorkoutPlan cardioEndurance = new WorkoutPlan("Cardio Endurance", "medium");
    
            // 8. Assign the new workout plan to John
            sarah.assignWorkoutPlan(john, cardioEndurance);
    
            // 9. Print John's new workout plan
            johnsPlan = john.getWorkoutPlan();
            System.out.println("John's new workout plan: " + johnsPlan.getPlanName() + " (" + johnsPlan.getDifficulty() + ")");
    
            // 10. Change the difficulty of "Cardio Endurance" to "hard"
            johnsPlan.setDifficulty("hard");
    
            // 11. Print John's workout plan with the updated difficulty
            System.out.println("John's updated workout plan: " + johnsPlan.getPlanName() + " (" + johnsPlan.getDifficulty() + ")");
    
            // 12. Create another workout plan called "Yoga Flexibility"
            WorkoutPlan yogaFlexibility = sarah.createWorkoutPlan("Yoga Flexibility");
    
            // 13. Assign the "Yoga Flexibility" workout plan to John
            john.changeWorkoutPlan(yogaFlexibility);
    
            // 14. Print John's final workout plan
            johnsPlan = john.getWorkoutPlan();
            System.out.println("John's final workout plan: " + johnsPlan.getPlanName() + " (" + johnsPlan.getDifficulty() + ")");
        }
    }
    

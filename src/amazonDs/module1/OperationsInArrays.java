package src.amazonDs.module1;

public class OperationsInArrays {

    public static void main(String[] args){

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //accessing by index
        System.out.println("First day: " + daysOfWeek[0]); // Monday
        //find the length
        System.out.println("Number of days in a week: " + daysOfWeek.length);

        //iterating through array
        for(int index=0; index< daysOfWeek.length; index++){
            System.out.println("Day " + (index+1) + ": " + daysOfWeek[index]);
        }
        
        //inserting an element
        String[] daysOfWeek1 = {"Monday", "Tuesday", "Wednesday", "Thur", "Friday", "Saturday", "Sunday"};
        daysOfWeek1[3] = "Thursday"; //correcting the value at index 3
        for(int index=0; index< daysOfWeek1.length; index++){
            System.out.println("Day " + (index+1) + ": " + daysOfWeek1[index]);
        }

        //inserting an element at the end of the array
        String[] monthOfYear = new String[]{"Jan", "Feb", "Mar", "Apr", "May"};

        String newElement = "Jun";
        String[] tempArray = new String[6];
        for(int index=0; index< tempArray.length; index++){
            if( index == (tempArray.length -1)){    
                tempArray[index] = newElement;
            } else {
                tempArray[index] = monthOfYear[index];
            }
        }

        for(int index=0; index< tempArray.length; index++){
            System.out.println("Month " + (index+1) + ": " + tempArray[index]);
        }


        //Remove an element from an array
        String[] monthOfYear1 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        int indexToDelete = 2; //removing "Mar"
        if(indexToDelete >= 1 && indexToDelete < monthOfYear1.length){
            monthOfYear1[indexToDelete] = null; //marking the element as null
        }
        for(int index=0; index< monthOfYear1.length; index++){
            System.out.println("Month " + (index+1) + ": " + monthOfYear1[index]);  
        }


        //Remove 2nd element in an array

        String[] monthOfYear2 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        int deleteIndex = 1; //removing "Feb"
        String[] newMonthArray = new String[monthOfYear2.length -1];
        for(int index=0, i=0; index < monthOfYear2.length; index++){
            if( index != deleteIndex){
                newMonthArray[i++]= monthOfYear2[index];
            }
        }
        for(int index=0; index< newMonthArray.length; index++){
            System.out.println("Month " + (index+1) + ": " + newMonthArray[index]);  
        }
    }

    
}

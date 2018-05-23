/**
Class for the Sorting Algorithm and printing method;
 */

public class Algorithm {

    void bubbleSort(SalesRepresentative[] reps) {

        boolean swapped = true;

            for (int i = 0; i < reps.length-1; i ++) {

            swapped = false;
                for (int j = 0; j < reps.length-i-1; j++ ){

                    if (reps[j].getRevenue() <= reps[j+1].getRevenue()){
                    SalesRepresentative temp = reps[j];
                    reps[j] = reps[j+1];
                    reps[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

    }
    void printArray(SalesRepresentative[] reps){

        for(SalesRepresentative rep : reps){
            getPrint(rep);
            }

    }
    void getPrint(SalesRepresentative rep) {
        System.out.print(rep.getName() + " made " + rep.getRevenue() + ", ");
    }
}

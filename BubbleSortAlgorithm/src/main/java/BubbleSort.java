/** Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order. The sorting should be done based on the amount of revenue generated via sales. Each rep has a number of sales, and a quota / sale.
 After the sorting, the first object should be the rep with the most revenue generated. The last object in the array should be the rep with the least revenue generated.
 E.g
 Sales guy 1 has 10 sales with a quota of 500$. He has achieved 5000$ worth of sales.
 Sales guy 2 has 7 sales with a quota of 800$. He has achieved 5600$ worth of sales.
 Sorting code example:

 SalesRepresentative [ ] reps = ...

 SalesRepresentative [ ] sortedReps = sort(reps);

 // you need to implement the sort(SalesRepresentative [ ] reps) method. This can not be a static method.
*/

public class BubbleSort {

    public static void main(String[] args) {

        SalesRepresentative jon = new SalesRepresentative();
        jon.setName("Jon");
        jon.setQuota(500);
        jon.setSales(18);

        SalesRepresentative mel = new SalesRepresentative();
        mel.setName("Mel");
        mel.setQuota(400);
        mel.setSales(20);

        SalesRepresentative jim = new SalesRepresentative();
        jim.setName("Jim");
        jim.setQuota(370);
        jim.setSales(23);

        SalesRepresentative bob = new SalesRepresentative();
        bob.setName("Bob");
        bob.setQuota(450);
        bob.setSales(19);

        SalesRepresentative sue = new SalesRepresentative();
        sue.setName("Sue");
        sue.setQuota(435);
        sue.setSales(17);

        SalesRepresentative[] reps = {jon, mel, jim, bob, sue};

        Algorithm sort = new Algorithm();

        sort.bubbleSort(reps);
        sort.printArray(reps);


        System.out.println();
        System.out.println("While the initial sort was showing: ");
        System.out.println(jon.getName() + " made " + jon.getRevenue());   // Kept for testing purposes. Delete block comment marks for testing.
        System.out.println(mel.getName() + " made " + mel.getRevenue());         // .getRevenue() method will return quota*sales.
        System.out.println(jim.getName() + " made " + jim.getRevenue());
        System.out.println(bob.getName() + " made " + bob.getRevenue());
        System.out.println(sue.getName() + " made " + sue.getRevenue());

    }


}

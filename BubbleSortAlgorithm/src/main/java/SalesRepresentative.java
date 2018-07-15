/** Class for the Sales Representative object
 *
 */

public class SalesRepresentative {

    String  name;
    int sales;
    int quota;
    int revenue;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getSales() {

        return sales;
    }

    public void setSales(int sales) {

        this.sales = sales;
    }

    public int getQuota() {

        return quota;
    }

    public void setQuota(int quota) {

        this.quota = quota;
    }

    public void setRevenue(int revenue) {

        this.revenue = revenue;
    }

    public int getRevenue() {

        return sales * quota;
    }
}

public class Kindle {

    private int totalPages;
    private int currentPage;

    public Kindle(int pages) {
        currentPage = 1;
        totalPages = pages;
    }

    public void turnPages() {
        if (currentPage < totalPages) {
            currentPage++;
        } else {
            currentPage = totalPages;
            System.out.print("You are now on the last page.");
        }
    }


    public void turnPages(int pages) {
        if ((currentPage + pages) <= totalPages) {
            currentPage += pages;
        } else {
            System.out.print("You were on                : ");
            System.out.println(toString());
            System.out.println("Turning " + pages + " pages would take you past the last page.");
            System.out.print("You are now on             : ");
            System.out.print(toString());
        }

    }
    public String toString() {
        String output = "Page " + currentPage + " of " + totalPages + ".";
        return output;
    }
}

public class IMDb {
    public static void main(String[] args) {
        Movie TopMovie1 = new Movie();
            TopMovie1.Title = "Toy Story 4";
            TopMovie1.Weekend = "$120.9M";
            TopMovie1.Gross = "$120.9M";
            TopMovie1.Weeks = "1";
        System.out.println (TopMovie1.Title);
        System.out.println(TopMovie1.Weekend);
        System.out.println(TopMovie1.Gross);
        System.out.println(TopMovie1.Weeks);
    }
}

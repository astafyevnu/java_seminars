package seminar2.hw;

public class M1Where {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder request = new StringBuilder("select * from students where");

        str = str.substring(1, str.length() - 1);
        String[] filter = str.split(", ");

        for (int i = 0; i < filter.length; i++) {
            String[] twins = filter[i].split(":");
            String data = twins[1];
            if (!data.equals("\"null\"")) {
                String check = twins[0].substring(1, twins[0].length() - 1);
                data = twins[1].substring(1, twins[1].length() - 1);
                request.append("\n").append(check).append(" = ").append(data);
            }
        }
        System.out.println("\n" + request);
    }
}

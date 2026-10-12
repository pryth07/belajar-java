public class SwitchDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break; // Jika month bernilai 1 maka set monthString menjadi January dan hentikan switch
            case 2:  monthString = "February";
                     break; // Jika month bernilai 2 maka set monthString menjadi February dan hentikan switch
            case 3:  monthString = "March";
                     break; // Jika month bernilai 3 maka set monthString menjadi March dan hentikan switch
            case 4:  monthString = "April";
                     break; // Jika month bernilai 4 maka set monthString menjadi April dan hentikan switch
            case 5:  monthString = "May";
                     break; // Jika month bernilai 5 maka set monthString menjadi May dan hentikan switch
            case 6:  monthString = "June";
                     break; // Jika month bernilai 6 maka set monthString menjadi June dan hentikan switch
            case 7:  monthString = "July";
                     break; // Jika month bernilai 7 maka set monthString menjadi July dan hentikan switch
            case 8:  monthString = "August";
                     break; // Jika month bernilai 8 maka set monthString menjadi August dan hentikan switch
            case 9:  monthString = "September";
                     break; // Jika month bernilai 9 maka set monthString menjadi September dan hentikan switch
            case 10: monthString = "October";
                     break; // Jika month bernilai 10 maka set monthString menjadi October dan hentikan switch
            case 11: monthString = "November";
                     break; // Jika month bernilai 11 maka set monthString menjadi November dan hentikan switch
            case 12: monthString = "December";
                     break; // Jika month bernilai 12 maka set monthString menjadi December dan hentikan switch
            default: monthString = "Invalid month";
                     break; // Jika month tidak bernilai antara 1-12, maka set monthString menjadi Invalid month dan hentikan switch
        }
        System.out.println(monthString);
    }
}

package korntip.skyict.co.th.ticketservice.utility;

import korntip.skyict.co.th.ticketservice.R;

public class MyConstance {

    private String[] titleListStrings = new String[]{"Ticket", "New Ticket", "Report", "About"};

    private int[] iconInts = new int[]{
            R.drawable.ic_action_ticket,
            R.drawable.ic_action_new_ticket,
            R.drawable.ic_action_new_report,
            R.drawable.ic_action_new_about};


    public String[] getTitleListStrings() {
        return titleListStrings;
    }

    public int[] getIconInts() {
        return iconInts;
    }
}

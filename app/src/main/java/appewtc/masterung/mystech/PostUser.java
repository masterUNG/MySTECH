package appewtc.masterung.mystech;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by masterUNG on 4/6/2017 AD.
 */

public class PostUser extends AsyncTask<String, Void, String>{

    private Context context;
    private static final String urlPHP = "http://swiftcodingthai.com/tech/addUserMaster.php";

    public PostUser(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        try {




        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}   // Main Class

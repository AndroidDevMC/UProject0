package portfolio.com.portfolioapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PortfolioActivity extends Activity {

    public Context context;
    private Button btnProj1;
    private Button btnProj2;
    private Button btnProj3;
    private Button btnProj4;
    private Button btnProj5;

    public View.OnClickListener toastEvent = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int currViewId = v.getId();
            int toastMsg = R.string.notfound;
            switch(currViewId){
                case R.id.btnProj1: toastMsg= R.string.btn_proj1; break;
                case R.id.btnProj2: toastMsg= R.string.btn_proj2; break;
                case R.id.btnProj3: toastMsg= R.string.btn_proj3; break;
                case R.id.btnProj4: toastMsg= R.string.btn_proj4; break;
                case R.id.btnProj5: toastMsg= R.string.btn_proj5; break;
                default:break;
            }
            toastMessage(toastMsg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        initializeValues();
        loadViews();
        loadListeners();
    }

    private void initializeValues(){
        context = getApplicationContext();
    }

    private void loadViews(){
        btnProj1 = (Button)findViewById(R.id.btnProj1);
        btnProj2 = (Button)findViewById(R.id.btnProj2);
        btnProj3 = (Button)findViewById(R.id.btnProj3);
        btnProj4 = (Button)findViewById(R.id.btnProj4);
        btnProj5 = (Button)findViewById(R.id.btnProj5);
    }

    private void loadListeners(){
        btnProj1.setOnClickListener(toastEvent);
        btnProj2.setOnClickListener(toastEvent);
        btnProj3.setOnClickListener(toastEvent);
        btnProj4.setOnClickListener(toastEvent);
        btnProj5.setOnClickListener(toastEvent);
    }

    protected void toastMessage(int msg){
        CharSequence text = getString(msg);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

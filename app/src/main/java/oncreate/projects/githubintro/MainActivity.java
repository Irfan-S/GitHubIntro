package oncreate.projects.githubintro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Sent from alt account, check

    //asdaddsadadasda

    public void showToast(View v){
        Toast.makeText(this,"Test 2",Toast.LENGTH_LONG).show();
    }
}

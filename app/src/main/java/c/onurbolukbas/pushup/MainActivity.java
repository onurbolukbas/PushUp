package c.onurbolukbas.pushup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void TestUpload()
    {
        int i=1+1;

        int ii=2+2;

        int iii=i+ii;
    }
    public void secondScreen(View view){
        Intent intent=new Intent(getApplicationContext(),MessageActivity.class);
        startActivity(intent);
    }
}
